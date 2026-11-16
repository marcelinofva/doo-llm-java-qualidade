// File: Event.java

public class Event {
    private String name;
    private String description;
    private Trainer trainer;

    public Event(String name, String description, Trainer trainer) {
        this.name = name;
        this.description = description;
        this.trainer = trainer;
    }

    public void addTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void updateDetails(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void delete() {
        // implement deletion logic
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Trainer getTrainer() {
        return trainer;
    }
}
