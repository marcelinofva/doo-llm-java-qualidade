// File: Fee.java

public class Fee {
    private Application application;

    public Fee(Application application) {
        this.application = application;
    }

    public void pay() {
        // payment logic
    }

    public Application getApplication() {
        return application;
    }
}
