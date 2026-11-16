// File: ResourceComponent.java

public class ResourceComponent {
    private String componentType;
    private String componentValue;

    public ResourceComponent(String type, String value) {
        this.componentType = type;
        this.componentValue = value;
    }

    public String getComponentType() {
        return componentType;
    }

    public String getComponentValue() {
        return componentValue;
    }
}
