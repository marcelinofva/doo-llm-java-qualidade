// File: DepositGroup.java

import java.util.ArrayList;
import java.util.List;

public class DepositGroup {
    private String name;
    private List<User> users;

    public DepositGroup(String name) {
        this.name = name;
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

    public List<User> getUsers() {
        return this.users;
    }
}
