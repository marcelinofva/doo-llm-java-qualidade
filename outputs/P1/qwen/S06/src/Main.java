public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher("DataHub Publisher");
        User owner = new User("owner@example.com");
        User member = new User("member@example.com");

        publisher.editProfile("Updated DataHub Publisher");
        publisher.inviteUser(member);
        publisher.inviteByEmail("newuser@example.com");
        publisher.viewMembers();
        publisher.makeOwner(member);
        publisher.removeOwner(owner);
        publisher.viewMembers();
    }
}
