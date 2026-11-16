public class Consumer {
    private Registry registry;

    public Consumer(Registry registry) {
        this.registry = registry;
    }

    public void viewDataPackage(String tagId) {
        Tag tag = registry.getTag(tagId);
        if (tag != null) {
            System.out.println("DataPackage: " + tag.getDataPackage().getId());
        } else {
            System.out.println("Tag not found.");
        }
    }

    public void downloadDataPackage(String tagId) {
        Tag tag = registry.getTag(tagId);
        if (tag != null) {
            System.out.println("Downloading DataPackage: " + tag.getDataPackage().getId());
        } else {
            System.out.println("Tag not found.");
        }
    }
}
