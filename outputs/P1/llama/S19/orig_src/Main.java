// File: Main.java

public class Main {
    public static void main(String[] args) {
        // create objects
        PlanReviewStaffMember staffMember = new PlanReviewStaffMember(new PlanReviewStaffSupervisor());
        Applicant applicant = new Applicant();
        PlanReviewStaff staff = new PlanReviewStaff();
        Plan plan = new Plan();
        CodeModification modification = new CodeModification(plan);
        Bond bond = new Bond(new Project());
        Inspector inspector = new Inspector();
        Inspection inspection = new Inspection(inspector);

        // demonstrate main flows
        staffMember.assignPlanForReview(plan);
        staffMember.managePlanReviewerWorkload();
        applicant.requestPlanReviewMeeting();
        staff.conductPlanReviewMeeting(applicant);
        staff.reviewPlan(plan);
        modification.getCodeModificationDetails();
        bond.getBondDetails();
        inspector.getInspectorDetails();
        inspection.getInspectionDetails();
    }
}
