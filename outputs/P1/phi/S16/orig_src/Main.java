// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Demonstration of main flows using hard-coded data
        User user = new User("john_doe", "john@example.com", "password123");
        user.login("password123");

        Training training = new Training("Java Basics", "Learn Java from scratch", "2023-09-01", "2023-09-10");
        User attendee = new User("jane_doe", "jane@example.com", "password123");
        attendee.registerForTraining(training);

        System.out.println("User's Schedule: " + user.getSchedule());
        System.out.println("Training's Attendees: " + training.getAttendees());
    }
}

