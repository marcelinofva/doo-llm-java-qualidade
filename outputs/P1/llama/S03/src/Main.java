// File: Main.java

public class Main {
    public static void main(String[] args) {
        User user = new User("1", "John Doe");
        RecyclingFacility facility = new RecyclingFacility("1", "Facility 1", "123 Main St");
        DonationCenter center = new DonationCenter("1", "Center 1", "456 Elm St");
        Event event = new Event("1", "Event 1", "789 Oak St");

        user.addFavorite(facility);
        user.addFavorite(center);
        facility.addAcceptedWasteType("Paper");
        center.setDonationTypes("Clothing, Shoes");

        System.out.println("User Favorites:");
        for (RecyclingFacility facility : user.getFavorites()) {
            System.out.println(facility.getName());
        }

        System.out.println("Donation Center Favorites:");
        for (DonationCenter center : user.getFavoritesDonation()) {
            System.out.println(center.getName());
        }

        System.out.println("Facility Hours:");
        System.out.println(facility.getHours());

        System.out.println("Event Details:");
        System.out.println(event.getEventDetails());
    }
}
