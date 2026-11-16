public class Importer {
    private EadFile eadFile;
    private Accession accession;
    private Resource resource;
    private MarcXmlRecord marcXmlRecord;
    private EadData eadData;
    private ErrorLog errorLog;

    public Importer(EadFile eadFile, Accession accession, Resource resource, MarcXmlRecord marcXmlRecord, EadData eadData, ErrorLog errorLog) {
        this.eadFile = eadFile;
        this.accession = accession;
        this.resource = resource;
        this.marcXmlRecord = marcXmlRecord;
        this.eadData = eadData;
        this.errorLog = errorLog;
    }

    public void importEadFile() {
        try {
            eadFile.read();
            eadFile.parse();
        } catch (Exception e) {
            errorLog.logError(e);
        }
    }

    public void importAccession() {
        try {
            accession.read();
            accession.parse();
        } catch (Exception e) {
            errorLog.logError(e);
        }
    }

    public void importResource() {
        try {
            resource.read();
            resource.parse();
        } catch (Exception e) {
            errorLog.logError(e);
        }
    }

    public void importMarcXmlRecord() {
        try {
            marcXmlRecord.parse();
        } catch (Exception e) {
            errorLog.logError(e);
        }
    }

    public void importEadData() {
        try {
            eadData.read();
            eadData.parse();
        } catch (Exception e) {
            errorLog.logError(e);
        }
    }
}
