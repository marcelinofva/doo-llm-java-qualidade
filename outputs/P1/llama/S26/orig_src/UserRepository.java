// File: UserRepository.java

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users;

    public UserRepository() {
        this.users = new ArrayList<>();
    }

    public void createUser(User user) {
        this.users.add(user);
    }

    public void updateUser(User user) {
        // implementation
    }

    public void deleteUser(User user) {
        this.users.remove(user);
    }

    public List<User> getUsers() {
        return this.users;
    }
}
