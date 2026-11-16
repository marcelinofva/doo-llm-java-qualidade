import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Dataset> datasets;

    public User(String username) {
        this.username = username;
        this.datasets = new ArrayList<>();
    }

    public void publishDataset(Dataset dataset) {
        datasets.add(dataset);
    }

    public void deleteDataset(Dataset dataset) {
        datasets.remove(dataset);
    }

    public void hideDataset(Dataset dataset) {
        dataset.hide();
    }

    public List<Dataset> getDatasets() {
        return datasets;
    }
}
