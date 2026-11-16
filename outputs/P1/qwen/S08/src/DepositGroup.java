import java.util.ArrayList;
import java.util.List;

public class DepositGroup {
    private String name;
    private List<User> users;
    private Permission permission;

    public DepositGroup(String name) {
        this.name = name;
        this.users = new ArrayList<>();
        this.permission = new Permission("view");
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public Permission getPermission() {
        return permission;
    }
}
