// File: User.java
public class User {
    private String name;
    private String email;
    private String zipCode;
    private List<Favorite> favorites;
    private List<Event> favoriteEvents;

    public User(String name, String email, String zipCode) {
        this.name = name;
        this.email = email;
        this.zipCode = zipCode;
        this.favorites = new ArrayList<>();
        this.favoriteEvents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public List<Favorite> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Favorite> favorites) {
        this.favorites = favorites;
    }

    public List<Event> getFavoriteEvents() {
        return favoriteEvents;
    }

    public void setFavoriteEvents(List<Event> favoriteEvents) {
        this.favoriteEvents = favoriteEvents;
    }

    public void addFavorite(Favorite favorite) {
        favorites.add(favorite);
    }

    public void removeFavorite(Favorite favorite) {
        favorites.remove(favorite);
    }

    public void addFavoriteEvent(Event event) {
        favoriteEvents.add(event);
    }

    public void removeFavoriteEvent(Event event) {
        favoriteEvents.remove(event);
    }
}

