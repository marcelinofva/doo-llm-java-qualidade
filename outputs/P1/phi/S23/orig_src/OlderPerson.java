// File: OlderPerson.java
public class OlderPerson {
    private String name;
    private String phoneNumber;
    private List<Meeting> meetings;
    private List<Reminder> reminders;

    public OlderPerson(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.meetings = new ArrayList<>();
        this.reminders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<Meeting> meetings) {
        this.meetings = meetings;
    }

    public List<Reminder> getReminders() {
        return reminders;
    }

    public void setReminders(List<Reminder> reminders) {
        this.reminders = reminders;
    }

    public void addMeeting(Meeting meeting) {
        meetings.add(meeting);
    }

    public void addReminder(Reminder reminder) {
        reminders.add(reminder);
    }
}

