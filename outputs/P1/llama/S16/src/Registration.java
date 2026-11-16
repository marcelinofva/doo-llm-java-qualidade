// File: Registration.java

public class Registration {
    private User user;
    private Training training;
    private boolean accepted;

    public Registration(User user, Training training) {
        this.user = user;
        this.training = training;
        this.accepted = false;
    }

    public User getUser() {
        return user;
    }

    public Training getTraining() {
        return training;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void accept() {
        accepted = true;
    }
}
