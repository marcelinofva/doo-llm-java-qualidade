// File: TransactionStatus.java
public class TransactionStatus {
    private String applicantName;
    private String status;

    public TransactionStatus(String applicantName, String status) {
        this.applicantName = applicantName;
        this.status = status;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getStatus() {
        return status;
    }

    public void checkStatus() {
        System.out.println("Status for " + applicantName + ": " + status);
    }
}
