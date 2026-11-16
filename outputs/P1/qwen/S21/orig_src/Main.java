public class Main {
    public static void main(String[] args) {
        Repository repository = new Repository();
        User user = new User("facultyMember");

        Collection collection = new Collection("My Collection");
        collection.applyBranding("Faculty Branding");
        collection.sortItems();

        Item item1 = new Item("Item 1", "Description 1", "Author 1");
        Item item2 = new Item("Item 2", "Description 2", "Author 2");
        collection.addItem(item1);
        collection.addItem(item2);

        user.assignCollection(collection);
        repository.createCollection(collection);

        // Simulate moving and renaming collection
        repository.moveCollection(collection, "New Location");
        repository.renameCollection(collection, "Renamed Collection");
    }
}
