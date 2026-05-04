package station;

import org.junit.jupiter.api.Test;
import sensors.HumiditySensor;
import sensors.PressureSensor;
import sensors.TemperatureSensor;
import weather.WeatherReport;

import static org.junit.jupiter.api.Assertions.*;

class StationTest {

    @Test
    void getWeatherReport() {
        WeatherReport report = new WeatherReport(0.0, 0.0, 0.0);
        Station s = new Station(new Location(44.26, 26.06, "Bucharest"));
        s.addSensor(new TemperatureSensor());
        s.addSensor(new PressureSensor());
        s.addSensor(new HumiditySensor());

        assertEquals(report, s.getWeatherReport());
    }
}