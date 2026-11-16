import java.util.ArrayList;
import java.util.List;
public class Project {
    private String id;
    private String title;
    private List<Dataset> datasets;

    public Project(String id, String title) {
        this.id = id;
        this.title = title;
        this.datasets = new ArrayList<>();
    }

    public void updateWorkflow() {
        // Update project workflow
    }
}
