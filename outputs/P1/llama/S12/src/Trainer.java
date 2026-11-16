// File: Trainer.java
import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private List<Course> courses;
    private List<Event> events;

    public Trainer(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.events = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void updateDetails(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Event> getEvents() {
        return events;
    }
}
