import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Meeting> meetings;

    public Agenda() {
        this.meetings = new ArrayList<>();
    }

    public void addMeeting(Meeting meeting) {
        meetings.add(meeting);
    }

    public void removeMeeting(Meeting meeting) {
        meetings.remove(meeting);
    }

    public List<Meeting> getUpcomingMeetings() {
        return meetings;
    }
}
