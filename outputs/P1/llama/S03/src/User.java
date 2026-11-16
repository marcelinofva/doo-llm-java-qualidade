// File: User.java

public class User {
    private String id;
    private String name;
    private List<RecyclingFacility> favorites;
    private List<DonationCenter> favoritesDonation;
    private String email;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.favorites = new ArrayList<>();
        this.favoritesDonation = new ArrayList<>();
    }

    public void addFavorite(RecyclingFacility facility) {
        favorites.add(facility);
    }

    public void addFavorite(DonationCenter center) {
        favoritesDonation.add(center);
    }

    public List<RecyclingFacility> getFavorites() {
        return favorites;
    }

    public List<DonationCenter> getFavoritesDonation() {
        return favoritesDonation;
    }

    public void subscribeToNotifications() {
        // implement notification subscription logic
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
