// File: Consumer.java

public class Consumer {
    public void viewDataPackage(DataPackage dataPackage, String tagName) {
        Tag tag = dataPackage.getTag(tagName);
        if (tag != null) {
            // view data package logic
        }
    }

    public void downloadDataPackage(DataPackage dataPackage, String tagName) {
        Tag tag = dataPackage.getTag(tagName);
        if (tag != null) {
            // download data package logic
        }
    }
}
