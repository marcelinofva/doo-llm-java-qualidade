public class SearchCriteria {
    private String name;
    private String email;
    private String details;

    public void setCriteria(String name, String email, String details) {
        this.name = name;
        this.email = email;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDetails() {
        return details;
    }
}
