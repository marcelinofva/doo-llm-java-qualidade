public class Role {
    private String name;
    private List<String> permissions;

    public Role(String name, List<String> permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    public void assignRole(User user) {
        user.assignRole(this);
    }

    public void removeRole(User user) {
        user.removeRole(this);
    }
}
