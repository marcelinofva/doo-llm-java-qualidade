// File: Main.java

public class Main {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Collection collection = new Collection("My Collection", "My Branding");
        Document document = new Document("My Metadata");

        collection.addDocument(document);
        repository.createCollection(collection);

        System.out.println("Collection name: " + collection.getName());
        System.out.println("Collection branding: " + collection.getBranding());
        System.out.println("Document metadata: " + document.getMetadata());

        repository.moveCollection(collection, new Collection("New Collection", "New Branding"));
        repository.renameCollection(collection, "Renamed Collection");

        System.out.println("Collections: " + repository.getCollections().size());
    }
}
