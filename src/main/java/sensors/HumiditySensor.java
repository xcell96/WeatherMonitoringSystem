package sensors;

public class HumiditySensor extends Sensor{
    public HumiditySensor() {
        super();
    }

    @Override
    public Double getData() {
        Double val = 0.0;
        predictionHistory.add(val);
        return val;
    }
}
