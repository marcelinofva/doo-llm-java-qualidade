// File: Dataset.java

public class Dataset {
    private String id;
    private String name;
    private String description;
    private boolean publicStatus;
    private User owner;

    public Dataset(String id, String name, String description, User owner) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.owner = owner;
        this.publicStatus = true;
    }

    public void add() {
        // add dataset to database
    }

    public void edit() {
        // edit dataset metadata
    }

    public void delete() {
        // delete dataset from database
    }

    public void hide() {
        this.publicStatus = false;
    }

    public void unhide() {
        this.publicStatus = true;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isPublicStatus() {
        return publicStatus;
    }

    public User getOwner() {
        return owner;
    }
}
