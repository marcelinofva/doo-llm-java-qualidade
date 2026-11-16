public class User {
    private String email;
    private Publisher.Publisher.Role role;

    public User(String email) {
        this.email = email;
        this.role = Publisher.Publisher.Role.MEMBER;
    }

    public String getEmail() {
        return email;
    }

    public Publisher.Publisher.Role getRole() {
        return role;
    }

    public void setRole(Publisher.Publisher.Role role) {
        this.role = role;
    }
}
