public class Payment {
    private double amount;
    private String transactionId;

    public Payment(double amount) {
        this.amount = amount;
        this.transactionId = generateTransactionId();
    }

    public String processPayment() {
        // Payment processing logic
        return transactionId;
    }

    private String generateTransactionId() {
        // Generate a unique transaction ID
        return UUID.randomUUID().toString();
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionId() {
        return transactionId;
    }
}
