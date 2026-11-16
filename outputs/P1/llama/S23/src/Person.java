// File: Person.java

public class Person {
    private String name;
    private Contact[] contacts;
    private Meeting[] meetings;
    private Reminder[] reminders;
    private Agenda agenda;

    public Person(String name) {
        this.name = name;
        this.contacts = new Contact[0];
        this.meetings = new Meeting[0];
        this.reminders = new Reminder[0];
        this.agenda = new Agenda(this);
    }

    public void addContact(Contact contact) {
        Contact[] newContacts = new Contact[contacts.length + 1];
        System.arraycopy(contacts, 0, newContacts, 0, contacts.length);
        newContacts[contacts.length] = contact;
        contacts = newContacts;
    }

    public void removeContact(Contact contact) {
        Contact[] newContacts = new Contact[contacts.length - 1];
        int i = 0;
        for (Contact c : contacts) {
            if (c != contact) {
                newContacts[i++] = c;
            }
        }
        contacts = newContacts;
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

    public Contact[] getContacts() {
        return contacts;
    }

    public Meeting[] getMeetings() {
        return meetings;
    }

    public Reminder[] getReminders() {
        return reminders;
    }

    public Agenda getAgenda() {
        return agenda;
    }
}
