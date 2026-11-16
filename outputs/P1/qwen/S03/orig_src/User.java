public class User {
    private String email;
    private List<DonationCenter> favorites;
    private List<Notification> notifications;

    public User(String email) {
        this.email = email;
        this.favorites = new ArrayList<>();
        this.notifications = new ArrayList<>();
    }

    public void register() {
        // Implementation
    }

    public void login() {
        // Implementation
    }

    public void addFavoriteCenter(DonationCenter center) {
        favorites.add(center);
    }

    public void receiveNotification(Notification notification) {
        notifications.add(notification);
    }
}
