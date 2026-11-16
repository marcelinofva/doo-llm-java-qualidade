// File: Item.java

public class Item {
    private String name;
    private List<Permission> permissions;

    public Item(String name) {
        this.name = name;
        this.permissions = new ArrayList<>();
    }

    public void addPermission(Permission permission) {
        this.permissions.add(permission);
    }

    public List<Permission> getPermissions() {
        return this.permissions;
    }
}
