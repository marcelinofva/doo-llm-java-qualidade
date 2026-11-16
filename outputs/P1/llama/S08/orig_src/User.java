// File: User.java

public class User {
    private String netID;
    private String name;
    private List<Permission> permissions;

    public User(String netID, String name) {
        this.netID = netID;
        this.name = name;
        this.permissions = new ArrayList<>();
    }

    public void addPermission(Permission permission) {
        this.permissions.add(permission);
    }

    public void removePermission(Permission permission) {
        this.permissions.remove(permission);
    }

    public List<Permission> getPermissions() {
        return this.permissions;
    }
}
