package weather;

import station.Location;

public record WeatherStatus(
        Double temperature,
        Double humidity,
        Double precipitation,
        Double pressure,
        Double dewPoint,
        Location location
) {}
