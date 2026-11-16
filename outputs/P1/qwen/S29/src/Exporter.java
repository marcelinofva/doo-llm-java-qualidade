public class Exporter {
    private EadData eadData;
    private ErrorLog errorLog;

    public Exporter(EadData eadData, ErrorLog errorLog) {
        this.eadData = eadData;
        this.errorLog = errorLog;
    }

    public void exportEadData() {
        try {
            // Implementation to export EAD data
        } catch (Exception e) {
            errorLog.logError(e);
        }
    }
}
