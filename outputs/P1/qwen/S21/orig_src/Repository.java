public class Repository {
    private List<Collection> collections;

    public Repository() {
        this.collections = new ArrayList<>();
    }

    public void createCollection(Collection collection) {
        collections.add(collection);
    }

    public void moveCollection(Collection collection, String newLocation) {
        collection.move(newLocation);
    }

    public void renameCollection(Collection collection, String newName) {
        collection.rename(newName);
    }
}
