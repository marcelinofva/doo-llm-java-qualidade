// File: Permission.java

public class Permission {
    private String[] allowedActions;

    public Permission(String[] allowedActions) {
        this.allowedActions = allowedActions;
    }

    public String[] getAllowedActions() {
        return allowedActions;
    }
}
