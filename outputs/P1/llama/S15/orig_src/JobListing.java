// File: JobListing.java

public class JobListing {
    private String jobTitle;
    private Sponsor sponsor;

    public JobListing(String jobTitle, Sponsor sponsor) {
        this.jobTitle = jobTitle;
        this.sponsor = sponsor;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
