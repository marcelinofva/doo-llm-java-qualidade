// File: PlanReviewStaffMember.java

public class PlanReviewStaffMember {
    private PlanReviewStaffSupervisor supervisor;
    private List<Plan> plans;

    public PlanReviewStaffMember(PlanReviewStaffSupervisor supervisor) {
        this.supervisor = supervisor;
        this.plans = new ArrayList<>();
    }

    public void assignPlanForReview(Plan plan) {
        plans.add(plan);
    }

    public void managePlanReviewerWorkload() {
        supervisor.managePlanReviewerWorkload();
    }
}
