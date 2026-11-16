// File: Collection.java

public class Collection {
    private String name;
    private CollectionCurator curator;
    private ReplicationPolicy policy;
    private List<Item> items;
    private List<Component> components;

    public Collection(String name) {
        this.name = name;
        this.items = new ArrayList<>();
        this.components = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public CollectionCurator getCurator() {
        return curator;
    }

    public void setCurator(CollectionCurator curator) {
        this.curator = curator;
    }

    public ReplicationPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(ReplicationPolicy policy) {
        this.policy = policy;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Component> getComponents() {
        return components;
    }

    public void addComponent(Component component) {
        components.add(component);
    }
}
