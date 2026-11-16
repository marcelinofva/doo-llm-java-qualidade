// File: Main.java

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe");
        Contact contact = new Contact("Jane Doe", "123-456-7890", "Notes");
        person.addContact(contact);

        Meeting meeting = new Meeting("10:00", "12:00", "Meeting notes");
        person.addMeeting(meeting);

        Reminder reminder = new Reminder("14:00", "Reminder notes");
        person.addReminder(reminder);

        Agenda agenda = person.getAgenda();
        agenda.addMeeting(meeting);
        agenda.addReminder(reminder);

        Alfred alfred = new Alfred(person);
        alfred.remindPerson();
        alfred.manageAgenda();
        alfred.manageContacts();
    }
}
