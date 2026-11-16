public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        dataSource.setFilePath("path/to/data.csv");

        DataModel dataModel = new DataModel();
        dataModel.setModel("Data model");

        DataValidator dataValidator = new DataValidator();

        DataImporter dataImporter = new DataImporter(dataSource, dataModel, dataValidator);
        dataImporter.importData();
        dataImporter.editModel();

        DataUpdater dataUpdater = new DataUpdater(dataSource, dataModel, dataValidator);
        dataUpdater.updateData();
    }
}
