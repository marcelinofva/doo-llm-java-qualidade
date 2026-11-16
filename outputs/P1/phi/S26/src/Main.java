// File: Main.java
public class Main {
    public static void main(String[] args) {
        User user = new User("JohnDoe", "password", UserRole.READ_ONLY);
        SystemAdministrator sysAdmin = new SystemAdministrator();
        sysAdmin.assignRepositoryManagerRole(user);
    }
}
