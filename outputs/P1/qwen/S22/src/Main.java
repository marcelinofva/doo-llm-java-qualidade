public class Main {
    public static void main(String[] args) {
        User depositor = new User("1", "John Doe");
        Dataset dataset = new Dataset("D1", "Sample Dataset", depositor);
        License license = new License("CC BY 4.0", "Creative Commons Attribution 4.0 International License");
        Publication publication = new Publication("P1", "Sample Publication");
        Project project = new Project("P1", "Sample Project");
        ResearchInformationManager manager = new ResearchInformationManager();

        depositor.grantPrivileges(dataset);
        dataset.applyLicense(license);
        dataset.linkPublication(publication);
        dataset.linkProject(project);
        publication.updateCitationCount();
        manager.trackCitationCount(dataset);
    }
}
