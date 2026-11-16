// File: Bond.java
public class Bond {
    private String id;
    private double amount;

    public Bond(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }
}

