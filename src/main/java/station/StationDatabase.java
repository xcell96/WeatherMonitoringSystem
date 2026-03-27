package station;

import java.util.List;

import sensors.HumiditySensor;
import sensors.PressureSensor;
import sensors.TemperatureSensor;
import weather.WeatherReport;

public class StationDatabase {
    private final List<Station> stations = List.of(
            new Station(new Location(44.26, 26.06, "Bucharest")),
            new Station(new Location(52.15, 21.00, "Warsaw")),
            new Station(new Location(52.31, 13.24, "Berlin"))
    );

    public StationDatabase(){
        Station a = stations.get(0);
        Station b = stations.get(1);
        Station c = stations.get(2);

        a.addSensor(new HumiditySensor());
        a.addSensor(new PressureSensor());
        a.addSensor(new TemperatureSensor());

        b.addSensor(new HumiditySensor());
        b.addSensor(new PressureSensor());
        b.addSensor(new TemperatureSensor());

        c.addSensor(new HumiditySensor());
        c.addSensor(new PressureSensor());
        c.addSensor(new TemperatureSensor());
    }

//    public void addStation(Station s){
//        stations.add(s);
//    }

    public List<Station> getStations(){
        return this.stations;
    }

    public WeatherReport getWeatherFor(Location location) throws ClassNotFoundException {
        for(Station s : stations){
            if(s.getLocation().equals(location)){
                return s.getWeatherReport();
            }
        }

        throw new ClassNotFoundException("Statia cu aceasta locatie nu exista in aceasta baza de date.");
    }
}
