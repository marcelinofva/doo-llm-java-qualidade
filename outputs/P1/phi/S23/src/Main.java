// File: Main.java
public class Main {
    public static void main(String[] args) {
        OlderPerson olderPerson = new OlderPerson("John Doe", "123-456-7890");
        olderPerson.addMeeting(new Meeting("Doctor's Appointment", "09:00 AM"));
        olderPerson.addReminder(new Reminder("Bring glasses to the appointment"));

        System.out.println("Older Person: " + olderPerson.getName());
        System.out.println("Phone Number: " + olderPerson.getPhoneNumber());

        for (Meeting meeting : olderPerson.getMeetings()) {
            System.out.println("Meeting: " + meeting.getTitle() + " at " + meeting.getTime());
        }

        for (Reminder reminder : olderPerson.getReminders()) {
            System.out.println("Reminder: " + reminder.getMessage());
        }
    }
}
