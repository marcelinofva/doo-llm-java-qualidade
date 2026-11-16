// File: Agenda.java

public class Agenda {
    private Person person;
    private Meeting[] meetings;
    private Reminder[] reminders;

    public Agenda(Person person) {
        this.person = person;
        this.meetings = new Meeting[0];
        this.reminders = new Reminder[0];
    }

    public void addMeeting(Meeting meeting) {
        Meeting[] newMeetings = new Meeting[meetings.length + 1];
        System.arraycopy(meetings, 0, newMeetings, 0, meetings.length);
        newMeetings[meetings.length] = meeting;
        meetings = newMeetings;
    }

    public void removeMeeting(Meeting meeting) {
        Meeting[] newMeetings = new Meeting[meetings.length - 1];
        int i = 0;
        for (Meeting m : meetings) {
            if (m != meeting) {
                newMeetings[i++] = m;
            }
        }
        meetings = newMeetings;
    }

    public void addReminder(Reminder reminder) {
        Reminder[] newReminders = new Reminder[reminders.length + 1];
        System.arraycopy(reminders, 0, newReminders, 0, reminders.length);
        newReminders[reminders.length] = reminder;
        reminders = newReminders;
    }

    public void removeReminder(Reminder reminder) {
        Reminder[] newReminders = new Reminder[reminders.length - 1];
        int i = 0;
        for (Reminder r : reminders) {
            if (r != reminder) {
                newReminders[i++] = r;
            }
        }
        reminders = newReminders;
    }

    public Meeting[] getMeetings() {
        return meetings;
    }

    public Reminder[] getReminders() {
        return reminders;
    }
}
