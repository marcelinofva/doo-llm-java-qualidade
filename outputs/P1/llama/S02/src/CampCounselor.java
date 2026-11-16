// File: CampCounselor.java

public class CampCounselor {
    private String name;
    private Group group;

    public CampCounselor(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    public void takeAttendance() {
        System.out.println(name + " is taking attendance for group " + group.getName());
    }
}
