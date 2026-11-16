// File: Main.java

public class Main {
    public static void main(String[] args) {
        EadFile eadFile = new EadFile("example ead data");
        eadFile.loadFromEadFile("path/to/ead/file");

        Accession accession = new Accession("example accession data");
        accession.loadFromCSV("path/to/csv/file");

        Resource resource = new Resource("example resource data");
        resource.loadFromMARCXML("path/to/marcxml/file");

        MARCXMLRecord marcxmlRecord = new MARCXMLRecord("example marcxml data");
        marcxmlRecord.loadFromMARCXML("path/to/marcxml/file");

        ImportError importError = new ImportError("example error type", "example error message");
        System.out.println(importError.getErrorType());
        System.out.println(importError.getErrorMessage());
    }
}
