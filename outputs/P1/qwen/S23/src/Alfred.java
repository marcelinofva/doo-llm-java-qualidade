public class Alfred {
    private OlderPerson olderPerson;
    private SocialCaregiver socialCaregiver;

    public Alfred(OlderPerson olderPerson, SocialCaregiver socialCaregiver) {
        this.olderPerson = olderPerson;
        this.socialCaregiver = socialCaregiver;
    }

    public void wakeUpCall() {
        System.out.println("Wake up! Are you okay?");
    }

    public void manageAgenda(Agenda agenda) {
        System.out.println("Managing agenda: " + agenda.getUpcomingMeetings());
    }

    public void insertMeeting(Meeting meeting) {
        olderPerson.getAgenda().addMeeting(meeting);
    }

    public void receiveReminder(Reminder reminder) {
        System.out.println("Reminder: " + reminder.getDetails());
    }
}
