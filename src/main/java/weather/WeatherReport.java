package weather;

public record WeatherReport(Double humidity, Double pressure, Double temperature) {
    @Override
    public boolean equals(Object o){
        if(!(o instanceof WeatherReport)) return false;
        WeatherReport r = (WeatherReport) o;
        return humidity.equals(r.humidity) &&
                pressure.equals(r.pressure) &&
                temperature.equals(r.temperature);
    }
}
