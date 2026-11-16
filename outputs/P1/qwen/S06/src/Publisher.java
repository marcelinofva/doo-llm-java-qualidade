import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private String name;
    private List<User> members;
    private List<Invitation> invitations;

    public Publisher(String name) {
        this.name = name;
        this.members = new ArrayList<>();
        this.invitations = new ArrayList<>();
    }

    public void editProfile(String newName) {
        this.name = newName;
    }

    public void inviteUser(User user) {
        members.add(user);
    }

    public void inviteByEmail(String email) {
        // Logic to send invitation email
        invitations.add(new Invitation(email));
    }

    public void removeMember(User user) {
        members.remove(user);
    }

    public void viewMembers() {
        for (User member : members) {
            System.out.println(member.getEmail() + " - " + member.getRole());
        }
    }

    public void makeOwner(User user) {
        user.setRole(Role.OWNER);
    }

    public void removeOwner(User user) {
        user.setRole(Role.MEMBER);
    }

    public enum Role {
        OWNER, MEMBER
    }

    private static class Invitation {
        private String email;

        public Invitation(String email) {
            this.email = email;
        }
    }
}
