// File: Main.java

public class Main {
    public static void main(String[] args) {
        Collection collection = new Collection("My Collection");
        CollectionCurator curator = new CollectionCurator(collection);
        RepositoryManager manager = new RepositoryManager();
        RemoteStorageSite site = new RemoteStorageSite();
        ReplicationPolicy policy = new ReplicationPolicy(true, true);
        ReplicationStatus status = new ReplicationStatus(false, false);

        collection.setCurator(curator);
        collection.setPolicy(policy);
        manager.addCollection(collection);
        site.addCollection(collection);

        curator.replicateCollection();
        manager.replicateCollection(collection);
        site.replicateCollection(collection);

        System.out.println("Collection replicated: " + status.isReplicated());
        System.out.println("Collection replicated beyond primary: " + status.isReplicatedBeyondPrimary());
    }
}
