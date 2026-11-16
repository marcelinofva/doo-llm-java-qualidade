// File: Publisher.java
import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private String name;
    private List<Member> members;

    public Publisher(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void inviteUser(User user) {
        Member member = new Member(user, this);
        members.add(member);
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public List<Member> viewMembers() {
        return members;
    }

    public void makeOwner(Member member) {
        member.setRole(Role.OWNER);
    }

    public void removeOwner(Member member) {
        member.setRole(Role.MEMBER);
    }
}
