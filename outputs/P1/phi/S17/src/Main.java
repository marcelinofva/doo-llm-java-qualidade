// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Demonstrate Customer Portal User Account
        CustomerPortal portal = new CustomerPortal("customer", "password");
        portal.authenticate();
        portal.performTransaction();

        // Demonstrate Applicant Submitting Application
        Applicant applicant = new Applicant("John Doe", "Application Details");
        applicant.submitApplication();

        // Demonstrate Applicant Submitting Supporting Documentation
        SupportingDocumentation documentation = new SupportingDocumentation("John Doe", "Supporting Document");
        documentation.submitSupportingDocumentation();

        // Demonstrate Applicant Paying Fee
        FeePayment feePayment = new FeePayment("John Doe", 100.0);
        feePayment.payFee();

        // Demonstrate Applicant Checking Transaction Status
        TransactionStatus status = new TransactionStatus("John Doe", "In Progress");
        status.checkStatus();

        // Demonstrate Applicant Modifying Application
        ApplicationModification modification = new ApplicationModification("John Doe", "Updated Application Details");
        modification.modifyApplication();

        // Demonstrate Staff Member Performing Completeness Review
        CompletenessReview completenessReview = new CompletenessReview("John Doe");
        completenessReview.performCompletenessReview();

        // Demonstrate Staff Member Assigning Application for Detailed Review
        DetailedReviewAssignment detailedReview = new DetailedReviewAssignment("John Doe");
        detailedReview.assignDetailedReview();
    }
}
