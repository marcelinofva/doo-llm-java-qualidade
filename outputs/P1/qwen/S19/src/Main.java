public class Main {
    public static void main(String[] args) {
        // Demonstrate main flows using hard-coded data
        Plan plan = new Plan();
        plan.setPlanId("P001");
        plan.setPlanDetails("Building permit for a new residential building");

        PlanReviewer reviewer = new PlanReviewer();
        reviewer.setReviewerId("R001");

        PlanReview planReview = new PlanReview();
        planReview.assignPlanToReviewer(plan, reviewer);
        planReview.conductReview();
        planReview.recordOutcome("Approved");

        Applicant applicant = new Applicant();
        applicant.requestPlanReviewMeeting(planReview);

        CodeModification codeModification = new CodeModification();
        codeModification.submitCodeModification();
        codeModification.approveCodeModification();
    }
}
