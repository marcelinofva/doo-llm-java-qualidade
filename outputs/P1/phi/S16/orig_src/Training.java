// File: Training.java
public class Training {
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<User> attendees;

    public Training(String name, String description, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.attendees = new ArrayList<>();
    }

    public void addAttendee(User user) {
        if (!attendees.contains(user)) {
            attendees.add(user);
        }
    }

    public List<User> getAttendees() {
        return attendees;
    }

    public static void main(String[] args) {
        // Demonstration of main flows using hard-coded data
        User user = new User("john_doe", "john@example.com", "password123");
        user.login("password123");

        Training training = new Training("Java Basics", "Learn Java from scratch", LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 10));
        user.registerForTraining(training);

        System.out.println("Training's Attendees: " + training.getAttendees());
    }
}
