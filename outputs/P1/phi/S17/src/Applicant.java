// File: Applicant.java
public class Applicant {
    private String name;
    private String applicationDetails;

    public Applicant(String name, String applicationDetails) {
        this.name = name;
        this.applicationDetails = applicationDetails;
    }

    public String getName() {
        return name;
    }

    public String getApplicationDetails() {
        return applicationDetails;
    }

    public void submitApplication() {
        System.out.println("Application submitted by: " + name);
    }
}
