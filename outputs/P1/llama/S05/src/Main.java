// File: Main.java

public class Main {
    public static void main(String[] args) {
        DataPackage dataPackage = new DataPackage("example", "schema");
        Publisher publisher = new Publisher();
        Consumer consumer = new Consumer();

        publisher.publishDataPackage(dataPackage);
        List<Tag> tags = publisher.getTags(dataPackage);

        consumer.viewDataPackage(dataPackage, "v1");
        consumer.downloadDataPackage(dataPackage, "v1");
    }
}
