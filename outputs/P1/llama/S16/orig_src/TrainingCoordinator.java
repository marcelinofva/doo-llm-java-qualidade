// File: TrainingCoordinator.java

public class TrainingCoordinator extends User {
    private AdminView adminView;

    public TrainingCoordinator(String id, String name, String email) {
        super(id, name, email);
        this.adminView = new AdminView();
    }

    public AdminView getAdminView() {
        return adminView;
    }
}
