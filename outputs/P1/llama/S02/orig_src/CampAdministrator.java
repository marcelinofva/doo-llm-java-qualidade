// File: CampAdministrator.java

import java.util.ArrayList;
import java.util.List;

public class CampAdministrator {
    private List<Group> groups;
    private List<Staff> staff;

    public CampAdministrator() {
        this.groups = new ArrayList<>();
        this.staff = new ArrayList<>();
    }

    public void manageGroup(Group group) {
        groups.add(group);
    }

    public void assignStaff(Staff staff) {
        this.staff.add(staff);
    }

    public List<Group> getGroups() {
        return groups;
    }

    public List<Staff> getStaff() {
        return staff;
    }
}
