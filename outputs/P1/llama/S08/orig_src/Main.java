// File: Main.java

public class Main {
    public static void main(String[] args) {
        // Create users
        User user1 = new User("netid1", "Name1");
        User user2 = new User("netid2", "Name2");

        // Create collection
        Collection collection = new Collection("Collection1");

        // Create deposit group
        DepositGroup depositGroup = new DepositGroup("DepositGroup1");

        // Add users to deposit group
        depositGroup.addUser(user1);
        depositGroup.addUser(user2);

        // Add deposit group to collection
        collection.addDepositGroup(depositGroup);

        // Create repository
        Repository repository = new Repository();

        // Add collection to repository
        repository.addCollection(collection);

        // Print collection's deposit groups
        for (DepositGroup depositGroup : collection.getDepositGroups()) {
            System.out.println(depositGroup.getUsers());
        }
    }
}
