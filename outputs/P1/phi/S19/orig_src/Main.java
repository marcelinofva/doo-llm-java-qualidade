// File: Main.java
public class Main {
    public static void main(String[] args) {
        PlanReviewStaff staff = new PlanReviewStaff();
        PlanReviewStaffSupervisor supervisor = new PlanReviewStaffSupervisor();
        Applicant applicant = new Applicant();
        Plan plan = new Plan();
        CodeModification codeModification = new CodeModification();
        Bond bond = new Bond();
        InspectionSupervisor inspectionSupervisor = new InspectionSupervisor();

        staff.assignPlanForReview(plan);
        supervisor.managePlanReviewerWorkload(staff);
        applicant.requestPlanReviewMeeting(staff);
        staff.conductPlanReviewMeeting(applicant, plan);
        staff.reviewPlans(plan);
        staff.reviewCodeModifications(codeModification);
        supervisor.manageBonds(bond);
        inspectionSupervisor.manageInspectorWorkload();
    }
}

