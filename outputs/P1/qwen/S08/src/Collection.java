import java.util.ArrayList;
import java.util.List;

public class Collection {
    private String name;
    private List<DepositGroup> depositGroups;
    private Permission defaultPermission;
    private boolean restrictAccessToDukeIPs;
    private boolean restrictSubmittersFromModifyingItems;
    private SubmissionWindow submissionWindow;

    public Collection(String name) {
        this.name = name;
        this.depositGroups = new ArrayList<>();
        this.defaultPermission = new Permission("view");
        this.restrictAccessToDukeIPs = false;
        this.restrictSubmittersFromModifyingItems = false;
        this.submissionWindow = new SubmissionWindow();
    }

    public void addGroup(DepositGroup group) {
        depositGroups.add(group);
    }

    public void removeGroup(DepositGroup group) {
        depositGroups.remove(group);
    }

    public void setDefaultPermission(Permission permission) {
        this.defaultPermission = permission;
    }

    public void restrictAccessToDukeIPs(boolean restrict) {
        this.restrictAccessToDukeIPs = restrict;
    }

    public void restrictSubmittersFromModifyingItems(boolean restrict) {
        this.restrictSubmittersFromModifyingItems = restrict;
    }

    public void changePermissions(DepositGroup group, Permission permission) {
        group.setPermission(permission);
    }

    public void viewPermissions(DepositGroup group) {
        System.out.println("Permissions for group " + group.getName() + ": " + group.getPermission());
    }

    public void setSubmissionWindow(SubmissionWindow window) {
        this.submissionWindow = window;
    }

    public String getName() {
        return name;
    }
}
