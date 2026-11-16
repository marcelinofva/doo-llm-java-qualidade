public class Main {
    public static void main(String[] args) {
        User user = new User("user@example.com");
        user.register();
        user.login();

        RecyclingFacility facility = new RecyclingFacility("Recycling Center", "123 Main St", new HashMap<>());
        DonationCenter center = new DonationCenter("Donation Center", "456 Elm St");
        Event event = new Event("Event Title", "789 Oak St");

        user.addFavoriteCenter(center);
        Notification notification = new Notification("New event posted!");
        user.receiveNotification(notification);
    }
}
