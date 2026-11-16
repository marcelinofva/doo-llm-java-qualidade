// File: Permission.java

public class Permission {
    private StaffMember staffMember;

    public Permission(StaffMember staffMember) {
        this.staffMember = staffMember;
    }

    public void grant() {
        // grant logic
    }

    public String getName() {
        return "Permission";
    }
}
