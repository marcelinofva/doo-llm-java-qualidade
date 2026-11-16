public class DataUpdater {
    private DataSource dataSource;
    private DataModel dataModel;
    private DataValidator dataValidator;

    public DataUpdater(DataSource dataSource, DataModel dataModel, DataValidator dataValidator) {
        this.dataSource = dataSource;
        this.dataModel = dataModel;
        this.dataValidator = dataValidator;
    }

    public void updateData() {
        String data = dataSource.readData();
        if (dataValidator.validateData(data)) {
            // Update data
        } else {
            // Handle validation error
        }
    }
}
