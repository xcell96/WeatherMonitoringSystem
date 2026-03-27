package sensors;

public class PressureSensor extends Sensor {
    public PressureSensor() {
        super();
    }

    @Override
    public Double getData() {
        Double val = 0.0;
        predictionHistory.add(val);
        return val;
    }
}
