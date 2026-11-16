public class JobPosting {
    private String title;
    private String description;
    private Sponsor sponsor;

    public JobPosting(String title, String description) {
        this.title = title;
        this.description = description;
        this.sponsor = null;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public String getDetails() {
        return "Job Title: " + title + ", Description: " + description;
    }
}
