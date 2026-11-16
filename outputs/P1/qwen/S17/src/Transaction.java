public class Transaction {
    private String id;
    private String status;

    public Transaction(String id) {
        this.id = id;
        this.status = "Pending";
    }

    public String getStatus() {
        return status;
    }
}
