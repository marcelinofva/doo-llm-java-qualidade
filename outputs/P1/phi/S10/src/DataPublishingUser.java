// File: DataPublishingUser.java
import java.util.ArrayList;
import java.util.List;

class DataPublishingUser {
    private String username;
    private List<Dataset> datasets;

    public DataPublishingUser(String username) {
        this.username = username;
        this.datasets = new ArrayList<>();
    }

    public void addDataset(String name, Dataset dataset) {
        datasets.add(dataset);
    }

    public void editDataset(String name, String newData) {
        datasets.stream()
             .filter(dataset -> dataset.getName().equals(name))
             .findFirst()
             .ifPresent(dataset -> dataset.setData(newData));
    }

    public void deleteDataset(String name) {
        datasets.removeIf(dataset -> dataset.getName().equals(name));
    }

    public void hideDataset(String name) {
        datasets.stream()
             .filter(dataset -> dataset.getName().equals(name))
             .findFirst()
             .ifPresent(dataset -> dataset.setHidden(true));
    }

    public List<Dataset> getDatasets() {
        return new ArrayList<>(datasets);
    }
}
