// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Demonstration of main flows using hard-coded data
        Dataset dataset = new Dataset("Sample Dataset", "Sample Description", "Sample License", true);
        DatasetAccessControl accessControl = new DatasetAccessControl();
        accessControl.grantAccess("collaborator1", dataset);
        accessControl.revokeAccess("collaborator1", dataset);

        Publication publication = new Publication("Sample Publication", "Sample Title", "Sample Journal", 2021);
        dataset.linkToPublication(publication);

        ComplianceTracker complianceTracker = new ComplianceTracker();
        complianceTracker.trackCitationCount(dataset);
    }
}

