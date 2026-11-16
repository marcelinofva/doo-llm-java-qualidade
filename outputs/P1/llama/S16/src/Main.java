// File: Main.java

public class Main {
    public static void main(String[] args) {
        User user = new User("1", "John Doe", "john.doe@example.com");
        Training training = new Training("1", "Java Programming", "Learn Java programming");
        Registration registration = new Registration(user, training);
        Attendee attendee = new Attendee("1", "John Doe", "john.doe@example.com", registration);
        TrainingCoordinator trainingCoordinator = new TrainingCoordinator("1", "Jane Doe", "jane.doe@example.com");
        AdminView adminView = trainingCoordinator.getAdminView();

        registration.accept();
        adminView.addRegistration(registration);

        System.out.println("User: " + user.getName());
        System.out.println("Training: " + training.getDetails());
        System.out.println("Registration: " + registration.isAccepted());
        System.out.println("Attendee: " + attendee.getRegistration().getTraining().getName());
        System.out.println("Admin View: " + adminView.getRegistrations().size());
    }
}
