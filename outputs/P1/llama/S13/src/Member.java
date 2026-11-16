// File: Member.java

public class Member {
    private String name;
    private String email;
    private Profile profile;

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
        this.profile = new Profile(this);
    }

    public Profile getProfile() {
        return profile;
    }

    public String getDetails() {
        return "Name: " + name + ", Email: " + email;
    }
}
