// File: Profile.java

import java.util.ArrayList;
import java.util.List;

public class Profile {
    private Member member;
    private List<Course> courses;

    public Profile(Member member) {
        this.member = member;
        this.courses = new ArrayList<>();
    }

    public Member getMember() {
        return member;
    }

    public String getDetails() {
        return "Member: " + member.getDetails() + ", Courses: " + courses.size();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }
}
