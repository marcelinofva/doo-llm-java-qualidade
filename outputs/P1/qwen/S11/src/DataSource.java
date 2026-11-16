public class DataSource {
    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String readData() {
        // Read data from file
        return "Data from file";
    }
}
