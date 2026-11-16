// File: Administrator.java
public class Administrator {
    private List<Sponsorship> sponsorships;

    public Administrator() {
        this.sponsorships = new ArrayList<>();
    }

    public void refundSponsorship(String stripeToken) {
        // Logic to refund sponsorship money processed via Stripe
        System.out.println("Refunding sponsorship for Stripe token: " + stripeToken);
    }

    public void addSponsorship(Sponsorship sponsorship) {
        sponsorships.add(sponsorship);
    }

    public void listSponsorships() {
        sponsorships.forEach(System.out::println);
    }
}

class Sponsorship {
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

class Sponsor {
    private String name;
    private List<Sponsorship> sponsorships;

    public Sponsor(String name) {
        this.name = name;
        this.sponsorships = new ArrayList<>();
    }

    public void addSponsorship(Sponsorship sponsorship) {
        sponsorships.add(sponsorship);
    }

    public void listSponsorships() {
        sponsorships.forEach(System.out::println);
    }
}

enum SponsorLevel {
    BASIC, STANDARD, PREMIUM
}

class Main {
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
