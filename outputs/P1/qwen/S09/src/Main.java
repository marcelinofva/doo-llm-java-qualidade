public class Main {
    public static void main(String[] args) {
        Collection collection = new Collection("Example Collection");
        Item item = new Item("Example Item");
        Component component = new Component("Example Component", new byte[0]);

        collection.addItem(item);
        item.addComponent(component);

        RepositoryManager repositoryManager = new RepositoryManager();
        RemoteReplicationPolicy policy = new RemoteReplicationPolicy();
        policy.setPolicy("Replicate to secondary site");
        repositoryManager.setReplicationPolicy(policy);

        byte[] encryptedFile = repositoryManager.encryptFile(component.getData());

        CollectionCurator curator = new CollectionCurator();
        curator.queueForReplication(collection);

        Dashboard dashboard = new Dashboard();
        System.out.println(dashboard.getCollectionSummary());
        System.out.println(dashboard.getDepositActivity());
    }
}
