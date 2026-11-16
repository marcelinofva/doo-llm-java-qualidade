// File: Sponsor.java

public class Sponsor {
    private String name;
    private List<SponsorshipLevel> sponsorshipLevels;

    public Sponsor(String name) {
        this.name = name;
        this.sponsorshipLevels = new ArrayList<>();
    }

    public List<SponsorshipLevel> getSponsorshipLevels() {
        return sponsorshipLevels;
    }

    public void addSponsorshipLevel(SponsorshipLevel level) {
        this.sponsorshipLevels.add(level);
    }
}
