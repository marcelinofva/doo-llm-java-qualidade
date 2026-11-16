// File: DataModel.java

public class DataModel {
    private String schema;

    public DataModel(String schema) {
        this.schema = schema;
    }

    public String getSchema() {
        return schema;
    }

    public void updateSchema(String newSchema) {
        this.schema = newSchema;
    }
}
