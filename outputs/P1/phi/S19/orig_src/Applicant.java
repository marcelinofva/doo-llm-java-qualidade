// File: Applicant.java
public class Applicant {
    private String name;

    public Applicant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void requestPlanReviewMeeting(PlanReviewStaff staff) {
        System.out.println("Requested plan review meeting with: " + staff.getName());
    }
}

