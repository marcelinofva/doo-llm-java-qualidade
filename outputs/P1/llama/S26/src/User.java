// File: User.java
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<Role> roles;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.roles = new ArrayList<>();
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
    }

    public void addRole(Role role) {
        this.roles.add(role);
    }

    public List<Role> getRoles() {
        return this.roles;
    }
}
