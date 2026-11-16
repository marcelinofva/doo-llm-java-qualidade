// File: Event.java

public class Event {
    private String id;
    private String name;
    private String location;
    private String details;

    public Event(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public String getEventDetails() {
        return details;
    }

    public void setEventDetails(String details) {
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
