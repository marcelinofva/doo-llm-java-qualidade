// File: Main.java
public class Main {
    public static void main(String[] args) {
        Repository repo = new Repository();
        Collection collection = new Collection("Research Papers", "Faculty of XYZ");
        collection.addContent(new Content("Paper 1", "Author A", "Metadata 1"));
        collection.addContent(new Content("Paper 2", "Author B", "Metadata 2"));

        repo.addCollection(collection);
        repo.renameCollection("Research Papers", "Faculty Research Papers");
        repo.moveCollection("Faculty Research Papers", "Digital Library");
        repo.searchCollection("Research Papers");
    }
}
