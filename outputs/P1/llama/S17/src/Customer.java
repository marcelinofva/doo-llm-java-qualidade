// File: Customer.java

public class Customer {
    private PortalUserAccount portalUserAccount;

    public PortalUserAccount createPortalUserAccount() {
        return new PortalUserAccount(this);
    }

    public PortalUserAccount getPortalUserAccount() {
        return portalUserAccount;
    }
}
