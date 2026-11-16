// File: Main.java

public class Main {
    public static void main(String[] args) {
        Depositor depositor = new Depositor();
        Dataset dataset = new Dataset();
        License license = new License();
        Collaborator collaborator = new Collaborator();
        Publication publication = new Publication();
        ProjectDMP projectDMP = new ProjectDMP();
        ResearchInformationManager manager = new ResearchInformationManager();

        depositor.depositDataset(dataset);
        dataset.setLicense(license);
        dataset.addCollaborator(collaborator);
        dataset.linkPublication(publication);
        dataset.linkProjectDMP(projectDMP);
        manager.trackCitationCount();
    }
}
