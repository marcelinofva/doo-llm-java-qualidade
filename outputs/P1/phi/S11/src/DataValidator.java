// File: DataValidator.java
public class DataValidator {
    private DataSource dataSource;

    public DataValidator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public boolean validateCSV() {
        System.out.println("Validating CSV file from: " + dataSource.getSourceType() + " at path: " + dataSource.getSourcePath());
        return true; // Simulate validation
    }
}

