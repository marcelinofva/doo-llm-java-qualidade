// File: User.java
public class User {
    private String username;
    private String email;
    private String password;
    private boolean isAuthenticated;
    private List<Training> registeredTrainings;
    private List<Training> waitlistedTrainings;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.isAuthenticated = false;
        this.registeredTrainings = new ArrayList<>();
        this.waitlistedTrainings = new ArrayList<>();
    }

    public void login(String password) {
        if (this.password.equals(password)) {
            this.isAuthenticated = true;
        }
    }

    public void registerForTraining(Training training) {
        if (isAuthenticated) {
            if (registeredTrainings.size() < 1) {
                registeredTrainings.add(training);
            } else {
                waitlistedTrainings.add(training);
            }
        }
    }

    public void addToSchedule(Training training) {
        if (isAuthenticated) {
            registeredTrainings.add(training);
        }
    }

    public List<Training> getSchedule() {
        return registeredTrainings;
    }

    public static void main(String[] args) {
        // Demonstration of main flows using hard-coded data
        User user = new User("john_doe", "john@example.com", "password123");
        user.login("password123");

        Training training = new Training("Java Basics", "Learn Java from scratch", "2023-09-01", "2023-09-10");
        user.registerForTraining(training);

        System.out.println("User's Schedule: " + user.getSchedule());
        System.out.println("Training's Attendees: " + training.getAttendees());
    }
}

