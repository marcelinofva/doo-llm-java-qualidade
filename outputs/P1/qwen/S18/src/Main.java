import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Hold hold = new Hold();
        Meeting meeting = new Meeting();
        Hearing hearing = new Hearing();
        Affidavit affidavit = new Affidavit();
        Response response = new Response();
        Note note = new Note();

        // Applying hold
        hold.applyHold();
        System.out.println("Hold applied: " + hold.isHeld());

        // Scheduling meeting
        meeting.scheduleMeeting(LocalDateTime.now().plusDays(1));
        System.out.println("Meeting scheduled for: " + meeting.getScheduledTime());

        // Submitting affidavit
        affidavit.submitAffidavit();
        System.out.println("Affidavit submitted: " + affidavit.isSubmitted());

        // Sending response
        response.sendResponse("Thank you for your application.");
        System.out.println("Response sent: " + response.getContent());

        // Recording note
        note.recordNote("Note for team: Review application thoroughly.");
        System.out.println("Note recorded: " + note.getContent());
    }
}
