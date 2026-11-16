// File: SponsorshipProfile.java

public class SponsorshipProfile {
    private User user;
    private Sponsor sponsor;

    public SponsorshipProfile(User user) {
        this.user = user;
        this.sponsor = new Sponsor("Default Sponsor");
    }

    public User getUser() {
        return user;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }
}
