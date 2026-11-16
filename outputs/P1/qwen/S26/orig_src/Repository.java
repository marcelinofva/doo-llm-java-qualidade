public class Repository {
    private String name;
    private List<Record> records;

    public Repository(String name) {
        this.name = name;
        this.records = new ArrayList<>();
    }

    public void createRecord(Record record) {
        records.add(record);
    }

    public void updateRecord(Record record) {
        // Implementation to update a record
    }

    public void deleteRecord(Record record) {
        records.remove(record);
    }
}
