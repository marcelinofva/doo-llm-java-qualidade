// File: ETD.java
public class ETD {
    private String metadata;
    private boolean embargoed;
    private String descriptiveRecord;

    public ETD(String metadata, boolean embargoed, String descriptiveRecord) {
        this.metadata = metadata;
        this.embargoed = embargoed;
        this.descriptiveRecord = descriptiveRecord;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public boolean isEmbargoed() {
        return embargoed;
    }

    public void setEmbargoed(boolean embargoed) {
        this.embargoed = embargoed;
    }

    public String getDescriptiveRecord() {
        return descriptiveRecord;
    }

    public void setDescriptiveRecord(String descriptiveRecord) {
        this.descriptiveRecord = descriptiveRecord;
    }
}
