// File: Main.java
public class Main {
    public static void main(String[] args) {
        MemberProfile memberProfile = new MemberProfile("John Doe", "Practitioner", "10 years of experience in Scrum", "Upcoming Classes: Advanced Scrum Master, Scrum for Teams", "john.doe@example.com", true, false);
        System.out.println("Name: " + memberProfile.getName());
        System.out.println("Role: " + memberProfile.getRole());
        System.out.println("Experience: " + memberProfile.getExperience());
        System.out.println("Upcoming Classes: " + memberProfile.getUpcomingClasses());
        System.out.println("Email: " + memberProfile.getEmail());
        System.out.println("Is Profile Private: " + memberProfile.isPrivate());
        System.out.println("Is Email Private: " + memberProfile.isEmailPrivate());
    }
}
