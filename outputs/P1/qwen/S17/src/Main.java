public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("customer1", "password1");
        customer.createAccount();
        customer.login();

        Applicant applicant = new Applicant("applicant1", "applicant1@example.com");
        applicant.submitApplication();
        applicant.submitDocument();
        applicant.payFee();
        applicant.checkStatus();
        applicant.modifyApplication();

        Staff staff = new Staff("staff1", "password1");
        staff.performCompletenessReview();
        staff.assignForDetailedReview();
    }
}
