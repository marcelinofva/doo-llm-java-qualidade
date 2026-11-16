// File: ApplicationAdministrator.java
public class ApplicationAdministrator {
    public void resetUserPassword(User user) {
        user.setPassword("newPassword");
        System.out.println("Password reset for user: " + user.getName());
    }
}

public class User {
    private String name;
    private String password;
    private UserRole role;

    public User(String name, String password, UserRole role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}

public enum UserRole {
    READ_ONLY,
    BASIC_DATA_ENTRY,
    REPOSITORY_MANAGER
}

public class Main {
    public static void main(String[] args) {
        User user = new User("JohnDoe", "oldPassword", UserRole.READ_ONLY);
        ApplicationAdministrator admin = new ApplicationAdministrator();
        admin.resetUserPassword(user);
    }
}
