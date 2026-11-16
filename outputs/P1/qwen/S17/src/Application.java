public class Application {
    private String id;
    private String status;

    public Application(String id) {
        this.id = id;
        this.status = "Pending";
    }

    public String getStatus() {
        return status;
    }

    public boolean isComplete() {
        // Implementation
        return false;
    }

    public void assignForReview() {
        // Implementation
    }
}
