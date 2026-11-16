public class OlderPerson {
    private Agenda agenda;
    private ContactList contactList;

    public OlderPerson() {
        this.agenda = new Agenda();
        this.contactList = new ContactList();
    }

    public void addContact(String name, String phoneNumber) {
        contactList.addContact(name, phoneNumber);
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void receiveReminder(Reminder reminder) {
        System.out.println("Reminder: " + reminder.getDetails());
    }
}
