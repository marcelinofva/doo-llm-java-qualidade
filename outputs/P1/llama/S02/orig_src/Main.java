// File: Main.java

public class Main {
    public static void main(String[] args) {
        // Create campers
        Camper camper1 = new Camper("John Doe", "12345");
        Camper camper2 = new Camper("Jane Doe", "67890");

        // Create parent
        Parent parent = new Parent("John Doe", "12345");
        parent.enrollChild(camper1);

        // Create group
        Group group = new Group("Group 1");
        group.addCamper(camper1);
        group.addCamper(camper2);

        // Create activity
        Activity activity = new Activity("Swimming", "Learn how to swim");

        // Create attendance
        Attendance attendance = new Attendance();
        attendance.logAttendance(camper1);

        // Create staff
        Staff staff = new Staff("John Smith", "Counselor");

        // Create camp administrator
        CampAdministrator administrator = new CampAdministrator();
        administrator.manageGroup(group);
        administrator.assignStaff(staff);

        // Create camp counselor
        CampCounselor counselor = new CampCounselor("Jane Smith", group);

        // Demonstrate main flows
        System.out.println("Camper 1 is attending the camp.");
        camper1.attend();
        System.out.println("Parent " + parent.getName() + " has enrolled child " + parent.getChild().getName());
        parent.enrollChild(camper2);
        System.out.println("Group " + group.getName() + " has scheduled activity " + activity.getName());
        group.scheduleActivity(activity);
        System.out.println("Attendance for group " + group.getName() + ": " + attendance.viewAttendance());
        System.out.println("Staff " + staff.getName() + " has position " + staff.getPosition());
        administrator.assignStaff(staff);
        System.out.println("Camp counselor " + counselor.getName() + " is taking attendance for group " + counselor.getGroup().getName());
        counselor.takeAttendance();
    }
}
