// File: Main.java

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        DataPackage dataPackage = new DataPackage("id1", "name1", publisher);
        publisher.publish(dataPackage);

        Registry registry = new Registry();
        registry.add(dataPackage);

        publisher.unpublish(dataPackage);
        registry.remove(dataPackage);

        publisher.publish(dataPackage);
        registry.restore(dataPackage);
    }
}
