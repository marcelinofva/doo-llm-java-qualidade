// File: Payment.java

public class Payment {
    private Sponsor sponsor;
    private double amount;

    public Payment(Sponsor sponsor, double amount) {
        this.sponsor = sponsor;
        this.amount = amount;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public double getAmount() {
        return amount;
    }
}
