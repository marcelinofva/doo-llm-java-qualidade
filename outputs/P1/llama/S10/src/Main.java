// File: Main.java

public class Main {
    public static void main(String[] args) {
        User user = new DataPublishingUser("1", "john", "password");
        Dataset dataset = new Dataset("1", "My Dataset", "This is my dataset", user);
        user.addDataset(dataset);
        System.out.println(dataset.getName()); // My Dataset
        dataset.hide();
        System.out.println(dataset.isPublicStatus()); // false
        PlatformAdministrator admin = new PlatformAdministrator("2", "admin", "password");
        admin.hideDataset(dataset);
        System.out.println(dataset.isPublicStatus()); // true
        admin.deleteDataset(dataset);
        System.out.println(dataset.isPublicStatus()); // false
    }
}
