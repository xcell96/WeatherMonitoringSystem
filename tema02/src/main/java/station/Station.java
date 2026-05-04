package station;

import sensors.HumiditySensor;
import sensors.PressureSensor;
import sensors.Sensor;
import sensors.TemperatureSensor;
import weather.WeatherReport;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private final Location location;
    private final List<Sensor> sensors;

    public Station(Location location){
        this.location = location;
        this.sensors = new ArrayList<>();
    }

    public Location getLocation() { return this.location; }

    public void addSensor(Sensor s){
        this.sensors.add(s);
    }

    private Double calculateHumidity(){
        Double sum = 0.0;
        int n = 0;
        for(Sensor s : sensors){
            if(s instanceof HumiditySensor){
                sum += s.getData();
                n++;
            }
        }

        return sum / n;
    }

    private Double calculatePressure(){
        Double sum = 0.0;
        int n = 0;
        for(Sensor s : sensors){
            if(s instanceof PressureSensor){
                sum += s.getData();
                n++;
            }
        }

        return sum / n;
    }

    private Double calculateTemperature(){
        Double sum = 0.0;
        int n = 0;
        for(Sensor s : sensors){
            if(s instanceof TemperatureSensor){
                sum += s.getData();
                n++;
            }
        }

        return sum / n;
    }

    public WeatherReport getWeatherReport(){
        return new WeatherReport(this.calculateHumidity(), this.calculatePressure(), this.calculateTemperature());
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Station)) return false;
        Station s = (Station)o;
        return location.equals(s.getLocation());
    }
}
