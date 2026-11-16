// File: Resource.java
import java.util.ArrayList;
import java.util.List;

public class Resource {
    private List<ResourceComponent> components;
    private List<Instance> instances;
    private String levelOfDescription;
    private String levelOfDescriptionValue;

    public Resource() {
        components = new ArrayList<>();
        instances = new ArrayList<>();
    }

    public void addComponent(ResourceComponent component) {
        components.add(component);
    }

    public void addInstance(Instance instance) {
        instances.add(instance);
    }

    public List<ResourceComponent> getComponents() {
        return components;
    }

    public List<Instance> getInstances() {
        return instances;
    }

    public void setLevelOfDescription(String level, String value) {
        this.levelOfDescription = level;
        this.levelOfDescriptionValue = value;
    }

    public String getLevelOfDescription() {
        return levelOfDescription;
    }

    public String getLevelOfDescriptionValue() {
        return levelOfDescriptionValue;
    }
}
