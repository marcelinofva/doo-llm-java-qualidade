// File: Sponsor.java
public class Sponsor {
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
