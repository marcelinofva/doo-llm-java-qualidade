// File: Main.java

public class Main {
    public static void main(String[] args) {
        // create a trainer
        Trainer trainer = new Trainer("John Doe");

        // create a course
        Course course = new Course("Java Fundamentals", "Introduction to Java", trainer);
        trainer.addCourse(course);

        // create an event
        Event event = new Event("Java Conference", "A conference about Java", trainer);
        trainer.addEvent(event);

        // create a site administrator
        SiteAdministrator siteAdmin = new SiteAdministrator();
        siteAdmin.addCourse(course);
        siteAdmin.addEvent(event);

        // set listing fee
        siteAdmin.setListingFee(course.getName(), 100.0);

        // update course details
        course.updateDetails("Java Programming", "Intermediate Java");

        // update event details
        event.updateDetails("Java Conference 2023", "A conference about Java in 2023");

        // delete course
        course.delete();

        // delete event
        event.delete();

        // update course using site editor
        SiteEditor siteEditor = new SiteEditor();
        siteEditor.updateCourse(course);

        // update event using site editor
        siteEditor.updateEvent(event);
    }
}
