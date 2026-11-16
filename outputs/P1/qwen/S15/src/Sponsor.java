public class Sponsor {
    private String name;
    private String contactInfo;
    private List<Sponsorship> sponsorships;

    public Sponsor(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.sponsorships = new ArrayList<>();
    }

    public void createSponsorship(Sponsorship sponsorship) {
        sponsorships.add(sponsorship);
    }

    public void linkSponsorshipToJob(Sponsorship sponsorship, JobPosting jobPosting) {
        sponsorship.setJobPosting(jobPosting);
    }

    public List<Sponsorship> getSponsorships() {
        return sponsorships;
    }
}
