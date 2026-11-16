// File: FeePayment.java
public class FeePayment {
    private String applicantName;
    private double amount;

    public FeePayment(String applicantName, double amount) {
        this.applicantName = applicantName;
        this.amount = amount;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public double getAmount() {
        return amount;
    }

    public void payFee() {
        System.out.println("Fee paid by: " + applicantName + ", Amount: " + amount);
    }
}
