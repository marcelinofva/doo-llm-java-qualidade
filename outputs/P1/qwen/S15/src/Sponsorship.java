public class Sponsorship {
    private double amount;
    private String level;
    private Payment payment;
    private JobPosting jobPosting;

    public Sponsorship(double amount, String level) {
        this.amount = amount;
        this.level = level;
        this.payment = null;
        this.jobPosting = null;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setJobPosting(JobPosting jobPosting) {
        this.jobPosting = jobPosting;
    }

    public double getAmount() {
        return amount;
    }

    public String getLevel() {
        return level;
    }

    public Payment getPayment() {
        return payment;
    }

    public JobPosting getJobPosting() {
        return jobPosting;
    }

    public String getDetails() {
        return "Sponsorship Level: " + level + ", Amount: $" + amount;
    }

    public String getPaymentStatus() {
        if (payment == null) {
            return "Payment Pending";
        } else {
            return "Payment Processed: " + payment.getTransactionId();
        }
    }
}
