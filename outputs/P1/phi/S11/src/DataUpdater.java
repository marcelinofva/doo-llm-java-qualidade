// File: DataUpdater.java
public class DataUpdater {
    private DataSource dataSource;

    public DataUpdater(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void updateData() {
        System.out.println("Updating data for source: " + dataSource.getSourceType() + " at path: " + dataSource.getSourcePath());
    }
}

