// File: Attendance.java

import java.util.ArrayList;
import java.util.List;

public class Attendance {
    private List<Camper> campers;
    private List<String> attendanceRecords;

    public Attendance() {
        this.campers = new ArrayList<>();
        this.attendanceRecords = new ArrayList<>();
    }

    public void logAttendance(Camper camper) {
        campers.add(camper);
        attendanceRecords.add("Camper " + camper.getName() + " is present.");
    }

    public void viewAttendance() {
        for (String record : attendanceRecords) {
            System.out.println(record);
        }
    }
}
