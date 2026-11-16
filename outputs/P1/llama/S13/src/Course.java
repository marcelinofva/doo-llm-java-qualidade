// File: Course.java

public class Course {
    private String name;
    private Profile profile;

    public Course(String name, Profile profile) {
        this.name = name;
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }

    public String getDetails() {
        return "Name: " + name + ", Profile: " + profile.getDetails();
    }
}
