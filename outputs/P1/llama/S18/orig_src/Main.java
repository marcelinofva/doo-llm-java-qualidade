// File: Main.java

public class Main {
    public static void main(String[] args) {
        // create staff member
        StaffMember staffMember = new StaffMember();

        // create application
        Application application = new Application();

        // create hold
        Hold hold = new Hold(application);

        // apply hold
        hold.applyHold();

        // create meeting
        Meeting meeting = new Meeting(staffMember, application, LocalDate.now(), LocalTime.now());

        // schedule meeting
        meeting.scheduleMeeting();

        // denote final action
        application.denoteFinalAction();

        // manage hearing calendar
        HearingCalendar hearingCalendar = new HearingCalendar(application);
        hearingCalendar.manageHearingCalendar();

        // manage affidavit
        Affidavit affidavit = new Affidavit(application);
        affidavit.manageAffidavit();

        // send formal response
        FormalResponse formalResponse = new FormalResponse(application);
        formalResponse.sendFormalResponse();

        // record internal note
        InternalNote internalNote = new InternalNote(application);
        internalNote.recordInternalNote();
    }
}
