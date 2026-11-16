// File: Role.java

public class Role {
    private List<User> users;
    private List<String> permissions;

    public Role() {
        users = new ArrayList<>();
        permissions = new ArrayList<>();
    }

    public void addPermission(String permission) {
        permissions.add(permission);
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
