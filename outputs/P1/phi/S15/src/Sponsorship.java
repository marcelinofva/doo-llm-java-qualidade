// File: Sponsorship.java
public class Sponsorship {
    private String stripeToken;
    private Sponsor sponsor;
    private SponsorLevel level;

    public Sponsorship(String stripeToken, Sponsor sponsor, SponsorLevel level) {
        this.stripeToken = stripeToken;
        this.sponsor = sponsor;
        this.level = level;
    }

    public void refund() {
        System.out.println("Refunding sponsorship for: " + stripeToken);
    }

    @Override
    public String toString() {
        return "Sponsorship{stripeToken='" + stripeToken + "', sponsor=" + sponsor + ", level=" + level + '}';
    }
}
