// File: CollectionCurator.java

public class CollectionCurator {
    private Collection collection;

    public CollectionCurator(Collection collection) {
        this.collection = collection;
    }

    public Collection getCollection() {
        return collection;
    }

    public void replicateCollection() {
        // replicate collection to remote storage site
    }
}
