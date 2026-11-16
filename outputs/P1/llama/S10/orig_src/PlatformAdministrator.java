// File: PlatformAdministrator.java

public class PlatformAdministrator extends User {
    public PlatformAdministrator(String id, String username, String password) {
        super(id, username, password);
    }

    public void hideDataset(Dataset dataset) {
        dataset.hide();
    }

    public void deleteDataset(Dataset dataset) {
        dataset.delete();
    }
}
