// File: SiteAdministrator.java

public class SiteAdministrator {
    private List<Course> courses;
    private List<Event> events;
    private Map<String, Double> listingFees;

    public SiteAdministrator() {
        this.courses = new ArrayList<>();
        this.events = new ArrayList<>();
        this.listingFees = new HashMap<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void setListingFee(String courseOrEventName, double fee) {
        listingFees.put(courseOrEventName, fee);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Event> getEvents() {
        return events;
    }

    public Map<String, Double> getListingFees() {
        return listingFees;
    }
}
