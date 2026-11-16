// File: User.java
import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String username;
    private String password;
    private List<Dataset> datasets;

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.datasets = new ArrayList<>();
    }

    public void authenticate(String username, String password) {
        // authenticate user
    }

    public void authorize() {
        // authorize user to perform actions
    }

    public void addDataset(Dataset dataset) {
        this.datasets.add(dataset);
    }

    public List<Dataset> getDatasets() {
        return datasets;
    }
}
