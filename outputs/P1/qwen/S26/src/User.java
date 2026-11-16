public class User {
    private String username;
    private String password;
    private AuthenticationMethod authenticationMethod;
    private List<Role> roles;

    public User(String username, String password, AuthenticationMethod authenticationMethod) {
        this.username = username;
        this.password = password;
        this.authenticationMethod = authenticationMethod;
        this.roles = new ArrayList<>();
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
    }

    public void createUser(String username, String password, AuthenticationMethod authenticationMethod) {
        // Implementation to create a new user
    }

    public boolean authenticate() {
        return authenticationMethod.authenticateUser(this);
    }

    public void assignRole(Role role) {
        roles.add(role);
    }

    public void removeRole(Role role) {
        roles.remove(role);
    }
}
