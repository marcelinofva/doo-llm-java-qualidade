import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create entities
        Parent parent = new Parent("John Doe");
        Camper camper1 = new Camper("Alice", parent);
        Camper camper2 = new Camper("Bob", parent);

        Group group = new Group("Group A");
        group.addCamper(camper1);
        group.addCamper(camper2);

        Activity activity = new Activity("Swimming", group);

        Attendance attendance = new Attendance(new Date());
        attendance.logCamper(camper1);
        attendance.logCamper(camper2);

        Staff staff = new Staff("Jane Smith", new Position("Counselor"));

        // Demonstrate main flows
        System.out.println("Parent: " + parent.getName());
        System.out.println("Camper 1: " + camper1.getName());
        System.out.println("Group: " + group.getName());
        System.out.println("Activity: " + activity.getName());
        System.out.println("Attendance: " + attendance.getDate());
        System.out.println("Staff: " + staff.getName() + ", Position: " + staff.getPosition().getName());
    }
}
