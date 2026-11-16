// File: Training.java

public class Training {
    private String id;
    private String name;
    private String description;

    public Training(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getDetails() {
        return "Training: " + name + ", Description: " + description;
    }

    public String getId() {
        return id;
    }
}
