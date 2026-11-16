// File: Depositor.java

public class Depositor {
    private List<Dataset> datasets;
    private List<Collaborator> collaborators;

    public Depositor() {
        datasets = new ArrayList<>();
        collaborators = new ArrayList<>();
    }

    public void depositDataset(Dataset dataset) {
        datasets.add(dataset);
    }

    public List<Dataset> getDatasets() {
        return datasets;
    }

    public void addCollaborator(Collaborator collaborator) {
        collaborators.add(collaborator);
    }
}
