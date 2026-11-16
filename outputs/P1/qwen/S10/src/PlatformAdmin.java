import java.util.ArrayList;
import java.util.List;

public class PlatformAdmin {
    private List<Dataset> datasets;

    public PlatformAdmin() {
        this.datasets = new ArrayList<>();
    }

    public void viewAllDatasets() {
        for (Dataset dataset : datasets) {
            System.out.println("Dataset: " + dataset.getTitle() + ", Public: " + dataset.isPublic() + ", Hidden: " + dataset.isHidden());
        }
    }

    public void deleteDataset(Dataset dataset) {
        datasets.remove(dataset);
    }

    public void hideDataset(Dataset dataset) {
        dataset.hide();
    }

    public void addDataset(Dataset dataset) {
        datasets.add(dataset);
    }
}
