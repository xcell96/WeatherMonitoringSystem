package sensors;

public class TemperatureSensor extends Sensor{
    public TemperatureSensor() {
        super();
    }

    @Override
    public Double getData() {
        Double val = 0.0;
        predictionHistory.add(val);
        return val;
    }
}
