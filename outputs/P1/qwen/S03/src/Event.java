import java.util.ArrayList;
import java.util.List;
public class Event {
    private String title;
    private String location;
    private List<Facility> associatedFacilities;

    public Event(String title, String location) {
        this.title = title;
        this.location = location;
        this.associatedFacilities = new ArrayList<>();
    }

    public String getDetails() {
        // Implementation
        return "Details";
    }

    public List<Facility> getAssociatedFacilities() {
        return associatedFacilities;
    }
}
