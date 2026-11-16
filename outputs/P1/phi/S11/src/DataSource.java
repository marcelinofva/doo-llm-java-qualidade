// File: DataSource.java
public class DataSource {
    private String sourceType;
    private String sourcePath;

    public DataSource(String sourceType, String sourcePath) {
        this.sourceType = sourceType;
        this.sourcePath = sourcePath;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }
}

