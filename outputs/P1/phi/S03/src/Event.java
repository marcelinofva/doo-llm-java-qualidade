// File: Event.java
import java.time.LocalDateTime;
public class Event {
    private String eventName;
    private LocalDateTime eventDateTime;

    public Event(String eventName, LocalDateTime eventDateTime) {
        this.eventName = eventName;
        this.eventDateTime = eventDateTime;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(LocalDateTime eventDateTime) {
        this.eventDateTime = eventDateTime;
    }
}

