// File: AdminView.java

public class AdminView {
    private List<Registration> registrations;

    public AdminView() {
        this.registrations = new ArrayList<>();
    }

    public void addRegistration(Registration registration) {
        registrations.add(registration);
    }

    public List<Registration> getRegistrations() {
        return registrations;
    }
}
