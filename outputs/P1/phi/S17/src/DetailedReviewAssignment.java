// File: DetailedReviewAssignment.java
public class DetailedReviewAssignment {
    private String applicantName;

    public DetailedReviewAssignment(String applicantName) {
        this.applicantName = applicantName;
    }

    public void assignDetailedReview() {
        System.out.println("Detailed review assigned for: " + applicantName);
    }
}
