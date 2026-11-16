public class Publisher {
    private Registry registry;

    public Publisher(Registry registry) {
        this.registry = registry;
    }

    public void publishDataPackage(DataPackage dataPackage) {
        registry.addDataPackage(dataPackage);
    }
}
