public class Member {
    private String name;
    private String email;
    private boolean isPrivate;
    private boolean isEmailPrivate;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public void setEmailPrivate(boolean isEmailPrivate) {
        this.isEmailPrivate = isEmailPrivate;
    }
}
