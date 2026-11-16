// File: Permission.java

public class Permission {
    private String name;
    private boolean granted;

    public Permission(String name) {
        this.name = name;
        this.granted = false;
    }

    public void grant() {
        this.granted = true;
    }

    public void revoke() {
        this.granted = false;
    }

    public boolean isGranted() {
        return this.granted;
    }
}
