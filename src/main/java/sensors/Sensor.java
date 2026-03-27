package sensors;

import java.util.ArrayList;
import java.util.List;

public abstract class Sensor {
    protected final List<Double> predictionHistory;

    protected Sensor() {
        this.predictionHistory = new ArrayList<>();
    }

    public abstract Double getData();
    public List<Double> getPredictionHistory(){
        return this.predictionHistory;
    }
}
