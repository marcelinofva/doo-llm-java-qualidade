// File: DataImporter.java
public class DataImporter {
    private DataSource dataSource;

    public DataImporter(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void importData() {
        System.out.println("Importing data from: " + dataSource.getSourceType() + " at path: " + dataSource.getSourcePath());
    }
}

