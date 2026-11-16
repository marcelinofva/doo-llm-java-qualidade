public class SocialCaregiver {
    private OlderPerson olderPerson;
    private Agenda agenda;

    public SocialCaregiver(OlderPerson olderPerson) {
        this.olderPerson = olderPerson;
        this.agenda = olderPerson.getAgenda();
    }

    public void addCaregiver(String name, String phoneNumber) {
        olderPerson.addContact(name, phoneNumber);
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void receiveReminder(Reminder reminder) {
        System.out.println("Reminder: " + reminder.getDetails());
    }
}
