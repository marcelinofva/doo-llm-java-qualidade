public class Item {
    private String name;
    private List<Component> components;

    public Item(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public String getName() {
        return name;
    }

    public List<Component> getComponents() {
        return components;
    }
}
