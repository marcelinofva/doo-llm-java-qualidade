// File: SocialCaregiver.java
public class SocialCaregiver {
    private String name;
    private List<Reminder> reminders;

    public SocialCaregiver(String name) {
        this.name = name;
        this.reminders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Reminder> getReminders() {
        return reminders;
    }

    public void setReminders(List<Reminder> reminders) {
        this.reminders = reminders;
    }

    public void addReminder(Reminder reminder) {
        reminders.add(reminder);
    }
}

