public class Tag {
    private String tagId;
    private DataPackage dataPackage;

    public Tag(String tagId, DataPackage dataPackage) {
        this.tagId = tagId;
        this.dataPackage = dataPackage;
    }

    public String getTagId() {
        return tagId;
    }

    public DataPackage getDataPackage() {
        return dataPackage;
    }
}
