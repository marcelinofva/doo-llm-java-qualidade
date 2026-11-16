// File: SiteEditor.java
import java.util.ArrayList;
import java.util.List;

public class SiteEditor {
    private List<Course> courses;
    private List<Event> events;

    public SiteEditor() {
        this.courses = new ArrayList<>();
        this.events = new ArrayList<>();
    }

    public void updateCourse(Course course) {
        // implement update logic
    }

    public void updateEvent(Event event) {
        // implement update logic
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Event> getEvents() {
        return events;
    }
}
