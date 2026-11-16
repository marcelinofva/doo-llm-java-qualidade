// File: Instance.java

public class Instance {
    private String instanceType;
    private String instanceValue;

    public Instance(String type, String value) {
        this.instanceType = type;
        this.instanceValue = value;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public String getInstanceValue() {
        return instanceValue;
    }
}
