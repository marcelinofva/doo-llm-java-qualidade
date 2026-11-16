// File: Repository.java

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private List<Collection> collections;

    public Repository() {
        this.collections = new ArrayList<>();
    }

    public void addCollection(Collection collection) {
        this.collections.add(collection);
    }

    public void removeCollection(Collection collection) {
        this.collections.remove(collection);
    }

    public List<Collection> getCollections() {
        return this.collections;
    }
}
