// File: PlanReviewStaff.java
public class PlanReviewStaff {
    public void assignPlanForReview(Plan plan) {
        System.out.println("Plan assigned for review: " + plan.getId());
    }

    public void conductPlanReviewMeeting(Applicant applicant, Plan plan) {
        System.out.println("Conducted plan review meeting for applicant: " + applicant.getName() + " and plan: " + plan.getId());
    }

    public void reviewPlans(Plan plan) {
        System.out.println("Reviewed plans for compliance: " + plan.getId());
    }

    public void reviewCodeModifications(CodeModification codeModification) {
        System.out.println("Reviewed code modifications: " + codeModification.getId());
    }
}

