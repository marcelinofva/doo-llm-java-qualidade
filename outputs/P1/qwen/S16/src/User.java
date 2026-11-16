public abstract class User {
    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract void registerForTraining(Training training);
    public abstract void addToWaitlist(Training training);
    public abstract void viewScheduledTrainings();
}
