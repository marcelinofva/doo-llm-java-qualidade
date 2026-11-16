// File: RepositoryManager.java
public class RepositoryManager {
    private Map<String, Collection> collections;
    private Map<String, RemoteSite> remoteSites;

    public RepositoryManager() {
        collections = new HashMap<>();
        remoteSites = new HashMap<>();
    }

    public void addCollection(String name, Collection collection) {
        collections.put(name, collection);
    }

    public void addRemoteSite(String name, RemoteSite site) {
        remoteSites.put(name, site);
    }

    public void setRemoteReplicationPolicy(String collectionName, RemoteSite site, boolean replicate) {
        Collection collection = collections.get(collectionName);
        if (collection != null) {
            collection.setRemoteSite(site, replicate);
        }
    }

    public void displayDashboardStatistics() {
        System.out.println("Dashboard Statistics:");
        collections.forEach((name, collection) -> {
            System.out.println("Collection: " + name);
            System.out.println("Number of Items: " + collection.getNumberOfItems());
            System.out.println("Number of Components: " + collection.getNumberOfComponents());
            System.out.println("Total Storage Consumed: " + collection.getTotalStorageConsumed() + " GB");
            System.out.println(" ");
        });
    }

    public static void main(String[] args) {
        RepositoryManager manager = new RepositoryManager();
        manager.addCollection("Collection1", new Collection("Collection1"));
        manager.addRemoteSite("RemoteSite1", new RemoteSite("RemoteSite1"));
        manager.setRemoteReplicationPolicy("Collection1", manager.remoteSites.get("RemoteSite1"), true);
        manager.displayDashboardStatistics();
    }
}

class Collection {
    private String name;
    private int numberOfItems;
    private int numberOfComponents;
    private double totalStorageConsumed;
    private RemoteSite remoteSite;

    public Collection(String name) {
        this.name = name;
        this.numberOfItems = 0;
        this.numberOfComponents = 0;
        this.totalStorageConsumed = 0.0;
        this.remoteSite = null;
    }

    public void ingestItem() {
        this.numberOfItems++;
    }

    public void ingestComponent() {
        this.numberOfComponents++;
    }

    public void setRemoteSite(RemoteSite remoteSite, boolean replicate) {
        this.remoteSite = remoteSite;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public int getNumberOfComponents() {
        return numberOfComponents;
    }

    public double getTotalStorageConsumed() {
        return totalStorageConsumed;
    }

    public void displayCollectionSummary() {
        System.out.println("Collection: " + name);
        System.out.println("Number of Items: " + numberOfItems);
        System.out.println("Number of Components: " + numberOfComponents);
        System.out.println("Total Storage Consumed: " + totalStorageConsumed + " GB");
        System.out.println(" ");
    }
}

class RemoteSite {
    private String name;
    private boolean replicate;

    public RemoteSite(String name) {
        this.name = name;
        this.replicate = false;
    }

    public void setReplicate(boolean replicate) {
        this.replicate = replicate;
    }

    public boolean isReplicate() {
        return replicate;
    }
}

