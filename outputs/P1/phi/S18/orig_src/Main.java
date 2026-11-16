// File: Main.java
public class Main {
    public static void main(String[] args) {
        StaffMember staffMember = new StaffMember("John Doe", "12345");
        staffMember.applyHold();
        staffMember.removeHold();
        staffMember.scheduleMeeting("2023-10-15T10:00:00", "Applicant, Judge, Lawyer");
        staffMember.denyFinalAction();
        staffMember.manageHearingCalendars();
        staffMember.manageAffidavits();
        staffMember.sendFormalResponse();
        staffMember.recordInternalNote();
    }
}
