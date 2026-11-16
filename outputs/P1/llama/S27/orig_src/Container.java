// File: Container.java

public class Container {
    private List<Instance> instances;
    private Location location;

    public Container() {
        instances = new ArrayList<>();
    }

    public void addInstance(Instance instance) {
        instances.add(instance);
    }

    public List<Instance> getInstances() {
        return instances;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}
