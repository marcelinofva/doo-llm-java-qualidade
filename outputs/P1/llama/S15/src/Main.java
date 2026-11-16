// File: Main.java

public class Main {
    public static void main(String[] args) {
        // create a sponsor
        Sponsor sponsor = new Sponsor("Example Sponsor");

        // create a sponsorship level
        SponsorshipLevel level = new SponsorshipLevel("Gold", sponsor);

        // create a payment method
        PaymentMethod paymentMethod = new PaymentMethod("Stripe");

        // create a payment
        Payment payment = new Payment(sponsor, 100.0);

        // process payment
        paymentMethod.processPayment(payment);

        // create a user
        User user = new User("Example User");

        // create a sponsorship profile
        SponsorshipProfile profile = new SponsorshipProfile(user);

        // add sponsorship level to sponsor
        sponsor.addSponsorshipLevel(level);

        // print sponsorship levels
        for (SponsorshipLevel level : sponsor.getSponsorshipLevels()) {
            System.out.println(level.getLevel());
        }
    }
}
