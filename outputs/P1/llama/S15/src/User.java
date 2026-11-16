// File: User.java

public class User {
    private String name;
    private SponsorshipProfile sponsorshipProfile;

    public User(String name) {
        this.name = name;
        this.sponsorshipProfile = new SponsorshipProfile(this);
    }

    public SponsorshipProfile getSponsorshipProfile() {
        return sponsorshipProfile;
    }

    public void addSponsorshipProfile(SponsorshipProfile profile) {
        this.sponsorshipProfile = profile;
    }
}
