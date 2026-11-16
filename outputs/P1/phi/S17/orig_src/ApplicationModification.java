// File: ApplicationModification.java
public class ApplicationModification {
    private String applicantName;
    private String updatedDetails;

    public ApplicationModification(String applicantName, String updatedDetails) {
        this.applicantName = applicantName;
        this.updatedDetails = updatedDetails;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getUpdatedDetails() {
        return updatedDetails;
    }

    public void modifyApplication() {
        System.out.println("Application modified by: " + applicantName);
    }
}
