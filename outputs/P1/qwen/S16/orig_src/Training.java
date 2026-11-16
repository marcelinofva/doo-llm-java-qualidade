public class Training {
    private String id;
    private String title;
    private int capacity;
    private List<Registration> registrations;
    private List<WaitlistEntry> waitlist;

    public Training(String id, String title, int capacity) {
        this.id = id;
        this.title = title;
        this.capacity = capacity;
        this.registrations = new ArrayList<>();
        this.waitlist = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public List<WaitlistEntry> getWaitlist() {
        return waitlist;
    }

    public void addRegistration(Registration registration) {
        // Implementation
    }

    public void addToWaitlist(WaitlistEntry entry) {
        // Implementation
    }

    public void removeRegistration(Registration registration) {
        // Implementation
    }

    public void removeWaitlistEntry(WaitlistEntry entry) {
        // Implementation
    }
}
