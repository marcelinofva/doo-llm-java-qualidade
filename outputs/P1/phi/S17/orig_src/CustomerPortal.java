// File: CustomerPortal.java
public class CustomerPortal {
    private String username;
    private String password;
    private boolean isAuthenticated;

    public CustomerPortal(String username, String password) {
        this.username = username;
        this.password = password;
        this.isAuthenticated = false;
    }

    public void authenticate() {
        // Simulate authentication
        this.isAuthenticated = true;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void performTransaction() {
        if (!isAuthenticated) {
            System.out.println("User must be authenticated to perform transactions.");
            return;
        }
        System.out.println("Performing transaction...");
    }
}

public class Main {
    public static void main(String[] args) {
        CustomerPortal portal = new CustomerPortal("customer", "password");
        portal.authenticate();
        portal.performTransaction();
    }
}
