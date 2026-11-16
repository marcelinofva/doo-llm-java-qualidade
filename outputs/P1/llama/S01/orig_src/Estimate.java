// File: Estimate.java

public class Estimate {
    private int value;
    private Estimator estimator;
    private Item item;

    public Estimate(int value, Estimator estimator, Item item) {
        this.value = value;
        this.estimator = estimator;
        this.item = item;
    }

    public int getEstimateValue() {
        return value;
    }
}
