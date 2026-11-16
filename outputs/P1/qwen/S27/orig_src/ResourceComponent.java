public class ResourceComponent {
    private String id;
    private String levelOfDescription;
    private List<Instance> instances;

    public ResourceComponent(String id) {
        this.id = id;
        this.instances = new ArrayList<>();
    }

    public void assignComponentId(String id) {
        this.id = id;
    }

    public void setLevelOfDescription(String level) {
        this.levelOfDescription = level;
    }

    public void addInstance(Instance instance) {
        instances.add(instance);
    }
}
