public class Main {
    public static void main(String[] args) {
        OlderPerson olderPerson = new OlderPerson();
        SocialCaregiver socialCaregiver = new SocialCaregiver(olderPerson);
        Alfred alfred = new Alfred(olderPerson, socialCaregiver);

        olderPerson.addContact("John Doe", "123-456-7890");
        olderPerson.getAgenda().addMeeting(new Meeting("Doctor's Appointment", "10:00 AM", "Clinic"));
        olderPerson.getAgenda().addMeeting(new Meeting("Grocery Shopping", "3:00 PM", "Supermarket"));

        alfred.wakeUpCall();
        alfred.manageAgenda(olderPerson.getAgenda());
        alfred.insertMeeting(new Meeting("Haircut", "2:00 PM", "Salon"));
        alfred.receiveReminder(new Reminder("Bring keys and wallet"));
    }
}
