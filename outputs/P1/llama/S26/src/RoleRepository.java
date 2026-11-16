// File: RoleRepository.java

import java.util.ArrayList;
import java.util.List;

public class RoleRepository {
    private List<Role> roles;

    public RoleRepository() {
        this.roles = new ArrayList<>();
    }

    public void createRole(Role role) {
        this.roles.add(role);
    }

    public void updateRole(Role role) {
        // implementation
    }

    public void deleteRole(Role role) {
        this.roles.remove(role);
    }

    public List<Role> getRoles() {
        return this.roles;
    }
}
