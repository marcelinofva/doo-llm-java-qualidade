// File: Main.java
public class Main {
    public static void main(String[] args) {
        DigitalRecordsArchivist archivist = new DigitalRecordsArchivist("Archivist1", "Config1", "Metadata1");
        archivist.liftEmbargoesOnReleaseDate();
        archivist.editEmbargoLength();
        archivist.grantEmbargoPrivileges();
        archivist.viewAndDownloadEmbargoMetadata();

        Item item = new Item("Item1", "2023-12-31", "Metadata for Item1");
        System.out.println("Item Title: " + item.getTitle());
        System.out.println("Embargo Date: " + item.getEmbargoDate());
        System.out.println("Metadata: " + item.getMetadata());
    }
}
