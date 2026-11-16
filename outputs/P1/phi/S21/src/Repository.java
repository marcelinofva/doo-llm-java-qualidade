// File: Repository.java
public class Repository {
    public void addCollection(Collection collection) {
        System.out.println("Collection added: " + collection.getName());
    }

    public void renameCollection(String oldName, String newName) {
        System.out.println("Collection renamed from " + oldName + " to " + newName);
    }

    public void moveCollection(String collectionName, String newLocation) {
        System.out.println("Collection moved from " + collectionName + " to " + newLocation);
    }

    public void searchCollection(String query) {
        System.out.println("Searching for: " + query);
    }
}

