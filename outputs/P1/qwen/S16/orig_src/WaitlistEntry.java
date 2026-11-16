public class WaitlistEntry {
    private User user;
    private Training training;

    public WaitlistEntry(User user, Training training) {
        this.user = user;
        this.training = training;
    }

    public User getUser() {
        return user;
    }

    public Training getTraining() {
        return training;
    }
}
