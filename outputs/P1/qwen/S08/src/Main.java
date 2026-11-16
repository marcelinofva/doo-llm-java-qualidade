public class Main {
    public static void main(String[] args) {
        Collection collection = new Collection("History Collection");
        DepositGroup group = new DepositGroup("Faculty Group");
        User user1 = new User("netid1");
        User user2 = new User("netid2");

        group.addUser(user1);
        group.addUser(user2);

        collection.addGroup(group);
        collection.setDefaultPermission(new Permission("submit"));
        collection.setSubmissionWindow(new SubmissionWindow());

        collection.viewPermissions(group);
    }
}
