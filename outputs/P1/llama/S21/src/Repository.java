// File: Repository.java

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private List<Collection> collections;

    public Repository() {
        collections = new ArrayList<>();
    }

    public void createCollection(Collection collection) {
        collections.add(collection);
    }

    public void removeCollection(Collection collection) {
        collections.remove(collection);
    }

    public void moveCollection(Collection collection, Collection destination) {
        collections.remove(collection);
        destination.addDocument(collection.getDocuments());
    }

    public void renameCollection(Collection collection, String newName) {
        collection.setName(newName);
    }

    public List<Collection> getCollections() {
        return collections;
    }
}
