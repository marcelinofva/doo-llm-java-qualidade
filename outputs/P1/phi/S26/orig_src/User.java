// File: User.java
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
