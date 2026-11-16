// File: Main.java

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        RoleRepository roleRepository = new RoleRepository();
        Repository repository = new Repository("Repository 1", "Description 1");
        RepositoryManager repositoryManager = new RepositoryManager(repository);

        User user = new User("username", "password");
        Role role = new Role("Role 1", "Description 1");
        userRepository.createUser(user);
        roleRepository.createRole(role);

        ReadOnlyUser readOnlyUser = new ReadOnlyUser("username", "password");
        readOnlyUser.viewArchivalDescriptions();

        BasicDataEntryUser basicDataEntryUser = new BasicDataEntryUser("username", "password");
        basicDataEntryUser.createArchivalDescription();
        basicDataEntryUser.updateArchivalDescription();
    }
}
