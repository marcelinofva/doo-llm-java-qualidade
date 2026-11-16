// File: CompletenessReview.java
public class CompletenessReview {
    private String applicantName;

    public CompletenessReview(String applicantName) {
        this.applicantName = applicantName;
    }

    public void performCompletenessReview() {
        System.out.println("Completeness review performed for: " + applicantName);
    }
}
