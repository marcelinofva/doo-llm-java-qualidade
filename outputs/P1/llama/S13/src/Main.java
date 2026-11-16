// File: Main.java

public class Main {
    public static void main(String[] args) {
        Member member = new Member("John Doe", "john.doe@example.com");
        Profile profile = member.getProfile();
        Course course = new Course("Java Programming", profile);
        profile.addCourse(course);

        System.out.println(member.getDetails());
        System.out.println(profile.getDetails());
        System.out.println(course.getDetails());

        SiteAdministrator administrator = new SiteAdministrator();
        administrator.editProfile(member);
    }
}
