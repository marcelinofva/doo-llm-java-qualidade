public class Registration {
    private User user;
    private Training training;
    private boolean cancellationTermsAccepted;

    public Registration(User user, Training training) {
        this.user = user;
        this.training = training;
        this.cancellationTermsAccepted = false;
    }

    public User getUser() {
        return user;
    }

    public Training getTraining() {
        return training;
    }

    public boolean isCancellationTermsAccepted() {
        return cancellationTermsAccepted;
    }

    public void acceptCancellationTerms(boolean accepted) {
        this.cancellationTermsAccepted = accepted;
    }
}
