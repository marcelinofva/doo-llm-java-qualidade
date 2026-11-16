// File: Main.java

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher("My Publisher");
        User user1 = new User("1", "John Doe", "john@example.com");
        User user2 = new User("2", "Jane Doe", "jane@example.com");

        publisher.inviteUser(user1);
        publisher.inviteUser(user2);

        System.out.println("Members:");
        for (Member member : publisher.viewMembers()) {
            System.out.println(member.getName());
        }

        publisher.makeOwner(publisher.viewMembers().get(0));
        System.out.println("Owner:");
        System.out.println(publisher.viewMembers().get(0).getName());

        publisher.removeOwner(publisher.viewMembers().get(0));
        System.out.println("Member:");
        System.out.println(publisher.viewMembers().get(0).getName());
    }
}
