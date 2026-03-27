package station;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StationDatabaseTest {

    @Test
    void stationsAreTheSame() {
        StationDatabase db1 = new StationDatabase();
        StationDatabase db2 = new StationDatabase();

        assertArrayEquals(db1.getStations().toArray(), db2.getStations().toArray());
    }

    @Test
    void getStations() {
        StationDatabase db = new StationDatabase();
        List<Station> stations = List.of(
                new Station(new Location(44.26, 26.06, "Bucharest")),
                new Station(new Location(52.15, 21.00, "Warsaw")),
                new Station(new Location(52.31, 13.24, "Berlin"))
        );

        assertArrayEquals(db.getStations().toArray(), stations.toArray());
    }

    @Test
    void getWeatherForUnlistedLocation() {
        Location unlisted = new Location(0.0, 0.0, "Paris");
        StationDatabase db = new StationDatabase();

        assertThrows(ClassNotFoundException.class, () -> db.getWeatherFor(unlisted));
    }

    @Test
    void getWeatherForListedLocation(){
        Location l = new Location(52.31, 13.24, "Berlin");
        StationDatabase db = new StationDatabase();

        assertDoesNotThrow(() -> db.getWeatherFor(l));
    }
}