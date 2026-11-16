// File: PortalUserAccount.java

public class PortalUserAccount {
    private Customer customer;

    public PortalUserAccount(Customer customer) {
        this.customer = customer;
    }

    public boolean authenticate(String username, String password) {
        // authentication logic
        return true;
    }

    public Customer getCustomer() {
        return customer;
    }
}
