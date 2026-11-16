// File: Reminder.java

public class Reminder {
    private String reminderTime;
    private String reminderNotes;

    public Reminder(String reminderTime, String reminderNotes) {
        this.reminderTime = reminderTime;
        this.reminderNotes = reminderNotes;
    }

    public String getReminderTime() {
        return reminderTime;
    }

    public String getReminderNotes() {
        return reminderNotes;
    }
}
