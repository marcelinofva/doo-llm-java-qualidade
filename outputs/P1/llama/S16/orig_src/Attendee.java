// File: Attendee.java

public class Attendee extends User {
    private Registration registration;

    public Attendee(String id, String name, String email, Registration registration) {
        super(id, name, email);
        this.registration = registration;
    }

    public Registration getRegistration() {
        return registration;
    }
}
