public class User {
    private String username;
    private List<Collection> collections;

    public User(String username) {
        this.username = username;
        this.collections = new ArrayList<>();
    }

    public void assignCollection(Collection collection) {
        collections.add(collection);
    }

    // Getters and setters
}
