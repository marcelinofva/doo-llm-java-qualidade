// File: PaymentMethod.java

public class PaymentMethod {
    private String method;

    public PaymentMethod(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    public void processPayment(Payment payment) {
        // implement payment processing logic
    }
}
