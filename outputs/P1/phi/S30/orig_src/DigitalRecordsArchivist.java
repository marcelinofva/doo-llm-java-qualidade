// File: DigitalRecordsArchivist.java
public class DigitalRecordsArchivist {
    public void ingestETDs(List<ETD> etds) {
        for (ETD etd : etds) {
            if (etd.isEmbargoed()) {
                setEmbargoed(etd);
            } else {
                ingestETD(etd);
            }
        }
    }

    private void setEmbargoed(ETD etd) {
        // Set embargoed logic
    }

    private void ingestETD(ETD etd) {
        // Ingest logic
    }
}

class ETD {
    private String metadata;
    private boolean embargoed;
    private String descriptiveRecord;

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

class Main {
    public static void main(String[] args) {
        List<ETD> etds = new ArrayList<>();
        etds.add(new ETD("Metadata1", true, "Record1"));
        etds.add(new ETD("Metadata2", false, "Record2"));

        DigitalRecordsArchivist archivist = new DigitalRecordsArchivist();
        archivist.ingestETDs(etds);
    }
}
