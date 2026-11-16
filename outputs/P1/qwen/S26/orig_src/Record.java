public class Record {
    private String id;
    private String description;

    public Record(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public void viewRecord() {
        // Implementation to view a record
    }

    public void updateRecord(String newDescription) {
        this.description = newDescription;
    }
}
