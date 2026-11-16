public class Event extends Course {
    private String eventType;

    public Event(String title, String description, String location, Date startDate, Date endDate, String eventType) {
        super(title, description, location, startDate, endDate);
        this.eventType = eventType;
    }

    // Getters and setters
}
