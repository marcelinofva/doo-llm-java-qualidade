// File: ETD.java

public class ETD {
    private String metadata;
    private File file;
    private Embargo embargo;
    private Permission permission;
    private DescriptiveRecord descriptiveRecord;

    public ETD(String metadata, File file) {
        this.metadata = metadata;
        this.file = file;
    }

    public String getMetadata() {
        return metadata;
    }

    public File getFile() {
        return file;
    }

    public void setEmbargo(Embargo embargo) {
        this.embargo = embargo;
    }

    public Embargo getEmbargo() {
        return embargo;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public Permission getPermission() {
        return permission;
    }

    public DescriptiveRecord getDescriptiveRecord() {
        return descriptiveRecord;
    }

    public void setDescriptiveRecord(DescriptiveRecord descriptiveRecord) {
        this.descriptiveRecord = descriptiveRecord;
    }
}
