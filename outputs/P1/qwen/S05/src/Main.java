public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Publisher publisher = new Publisher(registry);
        Consumer consumer = new Consumer(registry);

        DataPackage dp = new DataPackage("dp1");
        publisher.publishDataPackage(dp);

        dp.addTag(new Tag("v1", dp));
        dp.addTag(new Tag("v2", dp));

        consumer.viewDataPackage("v1");
        consumer.downloadDataPackage("v2");
    }
}
