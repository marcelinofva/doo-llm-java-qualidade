// File: RemoteStorageSite.java

public class RemoteStorageSite {
    private List<Collection> collections;

    public RemoteStorageSite() {
        this.collections = new ArrayList<>();
    }

    public List<Collection> getCollections() {
        return collections;
    }

    public void addCollection(Collection collection) {
        collections.add(collection);
    }
}
