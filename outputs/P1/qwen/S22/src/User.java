import java.util.ArrayList;
import java.util.List;
public class User {
    private String id;
    private String name;
    private List<Dataset> datasets;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.datasets = new ArrayList<>();
    }

    public void grantPrivileges(Dataset dataset) {
        dataset.addCollaborator(this);
    }
}
