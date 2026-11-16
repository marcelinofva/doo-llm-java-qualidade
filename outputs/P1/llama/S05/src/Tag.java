// File: Tag.java

public class Tag {
    private DataPackage dataPackage;
    private String tagName;

    public Tag(DataPackage dataPackage, String tagName) {
        this.dataPackage = dataPackage;
        this.tagName = tagName;
    }

    public DataPackage getDataPackage() {
        return this.dataPackage;
    }

    public String getTagName() {
        return this.tagName;
    }
}
