// File: Archivist.java
public class Archivist {
    public static void main(String[] args) {
        SubjectHeading subjectHeading = new SubjectHeading("History");
        String standardIdentifier = subjectHeading.getStandardIdentifier();
        System.out.println("Standard Identifier: " + standardIdentifier);

        Agent agent = new Agent("Doe, John", "Creator");
        System.out.println("Agent Name: " + agent.getName());
        System.out.println("Agent Role: " + agent.getRole());
    }
}

class SubjectHeading {
    private String standardIdentifier;

    public SubjectHeading(String standardIdentifier) {
        this.standardIdentifier = standardIdentifier;
    }

    public String getStandardIdentifier() {
        return standardIdentifier;
    }
}

class Agent {
    private String name;
    private String role;

    public Agent(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
