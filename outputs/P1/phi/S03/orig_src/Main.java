// File: Main.java
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("John Doe", "john.doe@example.com", "12345");

        RecyclingFacility plasticFacility = new RecyclingFacility("Plastic Recycling Center", "Plastics", "123 Main St", "9 AM - 5 PM");
        user.addFavorite(new Favorite(plasticFacility.getFacilityName()));

        Event event = new Event("Recycling Drive", LocalDateTime.now());
        user.addFavoriteEvent(event);

        System.out.println("User: " + user.getName());
        System.out.println("Favorite Facility: " + user.getFavorites().get(0).getFacilityName());
        System.out.println("Event: " + user.getFavoriteEvents().get(0).getEventName());
    }
}
