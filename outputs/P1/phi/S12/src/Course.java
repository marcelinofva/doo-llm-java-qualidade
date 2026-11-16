// File: Course.java
public class Course {
    private String id;
    private String title;
    private String description;
    private double price;
    private boolean isEvent;

    public Course(String id, String title, String description, double price, boolean isEvent) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.isEvent = isEvent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isEvent() {
        return isEvent;
    }

    public void setEvent(boolean event) {
        isEvent = event;
    }

    public void printCourseDetails() {
        System.out.println("Course ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("Is Event: " + isEvent);
        System.out.println();
    }
}

