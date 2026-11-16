// File: MemberProfile.java
public class MemberProfile {
    private String name;
    private String role;
    private String experience;
    private String upcomingClasses;
    private String email;
    private boolean isPrivate;
    private boolean isEmailPrivate;

    public MemberProfile(String name, String role, String experience, String upcomingClasses, String email, boolean isPrivate, boolean isEmailPrivate) {
        this.name = name;
        this.role = role;
        this.experience = experience;
        this.upcomingClasses = upcomingClasses;
        this.email = email;
        this.isPrivate = isPrivate;
        this.isEmailPrivate = isEmailPrivate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getUpcomingClasses() {
        return upcomingClasses;
    }

    public void setUpcomingClasses(String upcomingClasses) {
        this.upcomingClasses = upcomingClasses;
    }

    public String getEmail() {
        return isPrivate ? "Private" : email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean private) {
        isPrivate = private;
    }

    public boolean isEmailPrivate() {
        return isEmailPrivate;
    }

    public void setEmailPrivate(boolean emailPrivate) {
        isEmailPrivate = emailPrivate;
    }
}

