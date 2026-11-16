public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry();
        DataPackage dataPackage = new DataPackage("1", "SampleData", "Sample content");

        registry.publish(dataPackage);
        registry.unpublish(dataPackage);
        registry.delete(dataPackage);
        registry.restore(dataPackage);
    }
}
