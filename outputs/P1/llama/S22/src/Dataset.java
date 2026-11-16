// File: Dataset.java
import java.util.ArrayList;
import java.util.List;

public class Dataset {
    private String metadata;
    private License license;
    private List<Collaborator> collaborators;
    private Publication publication;
    private ProjectDMP projectDMP;

    public Dataset() {
        metadata = "";
        license = null;
        collaborators = new ArrayList<>();
        publication = null;
        projectDMP = null;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public List<Collaborator> getCollaborators() {
        return collaborators;
    }

    public void addCollaborator(Collaborator collaborator) {
        collaborators.add(collaborator);
    }

    public void linkPublication(Publication publication) {
        this.publication = publication;
    }

    public void linkProjectDMP(ProjectDMP projectDMP) {
        this.projectDMP = projectDMP;
    }
}
