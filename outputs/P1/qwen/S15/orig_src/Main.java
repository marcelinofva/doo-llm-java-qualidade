public class Main {
    public static void main(String[] args) {
        User user = new User("admin", "password");
        if (user.login("admin", "password")) {
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid credentials.");
        }

        Sponsor sponsor = new Sponsor("Tech Innovations", "contact@techinnovations.com");
        Sponsorship sponsorship = new Sponsorship(350, "Company Sponsorship");
        Payment payment = new Payment(350);
        sponsorship.setPayment(payment);
        sponsor.createSponsorship(sponsorship);

        JobPosting jobPosting = new JobPosting("Software Engineer", "Looking for a talented software engineer.");
        sponsorship.setJobPosting(jobPosting);
        sponsor.linkSponsorshipToJob(sponsorship, jobPosting);

        System.out.println(sponsorship.getDetails());
        System.out.println(sponsorship.getPaymentStatus());
        System.out.println(jobPosting.getDetails());
    }
}
