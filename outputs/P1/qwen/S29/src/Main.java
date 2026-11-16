public class Main {
    public static void main(String[] args) {
        EadFile eadFile = new EadFile();
        Accession accession = new Accession();
        Resource resource = new Resource();
        MarcXmlRecord marcXmlRecord = new MarcXmlRecord();
        EadData eadData = new EadData();
        ErrorLog errorLog = new ErrorLog();

        Importer importer = new Importer(eadFile, accession, resource, marcXmlRecord, eadData, errorLog);
        Exporter exporter = new Exporter(eadData, errorLog);

        importer.importEadFile();
        importer.importAccession();
        importer.importResource();
        importer.importMarcXmlRecord();
        importer.importEadData();

        exporter.exportEadData();
    }
}
