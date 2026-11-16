// File: AuthorAuthorityControl.java

public class AuthorAuthorityControl {
    private Repository repository;

    public AuthorAuthorityControl(Repository repository) {
        this.repository = repository;
    }

    public void performControl(List<ETD> etds) {
        for (ETD etd : etds) {
            // perform author authority control on etd
        }
    }
}
