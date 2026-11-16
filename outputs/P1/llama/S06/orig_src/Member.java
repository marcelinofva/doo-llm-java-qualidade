// File: Member.java

public class Member extends User {
    private Publisher publisher;
    private Role role;

    public Member(User user, Publisher publisher) {
        super(user.getId(), user.getName(), user.getEmail());
        this.publisher = publisher;
        this.role = Role.MEMBER;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
