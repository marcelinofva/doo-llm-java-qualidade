// File: Main.java
public class Main {
    public static void main(String[] args) {
        Administrator admin = new Administrator();
        Sponsor sponsor = new Sponsor("John Doe");
        Sponsorship sponsorship = new Sponsorship("stripeToken123", sponsor, SponsorLevel.STANDARD);
        admin.addSponsorship(sponsorship);

        System.out.println("Listing Sponsorships:");
        admin.listSponsorships();

        System.out.println("\nRefunding Sponsorship:");
        sponsorship.refund();
    }
}
