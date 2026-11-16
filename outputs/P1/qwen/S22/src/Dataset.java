import java.util.ArrayList;
import java.util.List;
public class Dataset {
    private String id;
    private String title;
    private User owner;
    private List<User> collaborators;
    private License license;
    private List<Publication> linkedPublications;
    private Project linkedProject;

    public Dataset(String id, String title, User owner) {
        this.id = id;
        this.title = title;
        this.owner = owner;
        this.collaborators = new ArrayList<>();
        this.linkedPublications = new ArrayList<>();
    }

    public void addCollaborator(User user) {
        collaborators.add(user);
    }

    public void linkPublication(Publication publication) {
        linkedPublications.add(publication);
    }

    public void linkProject(Project project) {
        linkedProject = project;
    }

    public void applyLicense(License license) {
        this.license = license;
    }
}
