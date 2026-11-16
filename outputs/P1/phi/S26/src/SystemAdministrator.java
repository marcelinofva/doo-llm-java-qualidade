// File: SystemAdministrator.java
public class SystemAdministrator {
    public void assignRepositoryManagerRole(User user) {
        user.setRole(UserRole.REPOSITORY_MANAGER);
        System.out.println("Assigned Repository Manager role to user: " + user.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        User user = new User("JaneDoe", "password", UserRole.READ_ONLY);
        SystemAdministrator sysAdmin = new SystemAdministrator();
        sysAdmin.assignRepository
