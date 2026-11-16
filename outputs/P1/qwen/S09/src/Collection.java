import java.util.ArrayList;
import java.util.List;
public class Collection {
    private String name;
    private List<Item> items;
    private List<Component> components;

    public Collection(String name) {
        this.name = name;
        this.items = new ArrayList<>();
        this.components = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Component> getComponents() {
        return components;
    }

    public String getReplicationStatus() {
        // Implement replication status logic
        return "Replication status for " + name;
    }
}
