public class Main {
    public static void main(String[] args) {
        PlatformAdmin admin = new PlatformAdmin();
        User user1 = new User("user1");
        User user2 = new User("user2");

        Dataset dataset1 = new Dataset("Dataset 1");
        Dataset dataset2 = new Dataset("Dataset 2");

        user1.publishDataset(dataset1);
        user2.publishDataset(dataset2);

        admin.addDataset(dataset1);
        admin.addDataset(dataset2);

        admin.viewAllDatasets();

        user1.hideDataset(dataset1);
        admin.hideDataset(dataset2);

        admin.viewAllDatasets();

        user1.deleteDataset(dataset1);
        admin.deleteDataset(dataset2);

        admin.viewAllDatasets();
    }
}
