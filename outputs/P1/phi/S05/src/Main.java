// File: Main.java
public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher("Data Publisher");

        DataPackage package1 = new DataPackage("v1", "Schema 1.0");
        DataPackage package2 = new DataPackage("v2", "Schema 1.1");
        DataPackage package3 = new DataPackage("v3", "Schema 1.2");

        publisher.createPackage(package1);
        publisher.createPackage(package2);
        publisher.createPackage(package3);

        publisher.overwritePackage(package2);
        publisher.overwritePackage(package3);

        publisher.viewPackageAtVersion(1);
        publisher.downloadPackageAtVersion(2);

        publisher.getSchemaChanges();
    }
}
