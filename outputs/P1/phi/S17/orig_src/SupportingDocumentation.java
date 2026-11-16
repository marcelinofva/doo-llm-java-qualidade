// File: SupportingDocumentation.java
public class SupportingDocumentation {
    private String applicantName;
    private String document;

    public SupportingDocumentation(String applicantName, String document) {
        this.applicantName = applicantName;
        this.document = document;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getDocument() {
        return document;
    }

    public void submitSupportingDocumentation() {
        System.out.println("Supporting documentation submitted by: " + applicantName);
    }
}
