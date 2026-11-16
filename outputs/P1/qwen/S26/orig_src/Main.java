public class Main {
    public static void main(String[] args) {
        User admin = new User("admin", "admin123", new LocalAuthentication());
        Role repositoryManager = new Role("Repository Manager", Arrays.asList("create", "update", "delete"));
        Repository repository = new Repository("Main Repository");

        admin.assignRole(repositoryManager);
        repository.createRecord(new Record("1", "Initial Record"));

        User readOnlyUser = new User("readonly", "readonly123", new LocalAuthentication());
        readOnlyUser.assignRole(new Role("ReadOnly", Arrays.asList("view")));

        User basicUser = new User("basic", "basic123", new LocalAuthentication());
        basicUser.assignRole(new Role("Basic Data Entry", Arrays.asList("create", "update")));

        admin.resetPassword("newAdminPassword");
        readOnlyUser.authenticate();
        basicUser.authenticate();
    }
}
