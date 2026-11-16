// File: Main.java
public class Main {
    public static void main(String[] args) {
        Course course = new Course("1", "Java Basics", "Learn Java from scratch", 100.0, false);
        course.printCourseDetails();

        Course event = new Course("2", "Java Workshop", "Interactive Java workshop", 200.0, true);
        event.printCourseDetails();
    }
}
