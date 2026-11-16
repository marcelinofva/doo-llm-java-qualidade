// File: DataSource.java

public class DataSource {
    private String name;
    private DataModel schema;

    public DataSource(String name, DataModel schema) {
        this.name = name;
        this.schema = schema;
    }

    public DataModel getSchema() {
        return schema;
    }

    public void importData(DataImporter importer) {
        importer.importData(this);
    }
}
