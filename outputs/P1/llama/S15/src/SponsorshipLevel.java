// File: SponsorshipLevel.java

public class SponsorshipLevel {
    private String level;
    private Sponsor sponsor;

    public SponsorshipLevel(String level, Sponsor sponsor) {
        this.level = level;
        this.sponsor = sponsor;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public String getLevel() {
        return level;
    }
}
