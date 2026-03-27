package station;

public record Location(Double longitude, Double latitude, String name) {
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Location)) return false;
        Location l = (Location)o;
        return this.longitude.equals(l.longitude()) &&
                this.latitude.equals(l.latitude()) &&
                this.name.equals(l.name());
    }
}
