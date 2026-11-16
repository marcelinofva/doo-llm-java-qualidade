// File: DataPublishingUser.java

public class DataPublishingUser extends User {
    public DataPublishingUser(String id, String username, String password) {
        super(id, username, password);
    }

    public void addDataset(Dataset dataset) {
        super.addDataset(dataset);
        dataset.hide();
    }

    public void hideDataset(Dataset dataset) {
        dataset.hide();
    }
}
