// File: Dataset.java
public class Dataset {
    private String name;
    private String description;
    private String license;
    private boolean isPublic;
    private List<Publication> linkedPublications;
    private List<Dataset> linkedProjects;

    public Dataset(String name, String description, String license, boolean isPublic) {
        this.name = name;
        this.description = description;
        this.license = license;
        this.isPublic = isPublic;
        this.linkedPublications = new ArrayList<>();
        this.linkedProjects = new ArrayList<>();
    }

    public void linkToPublication(Publication publication) {
        linkedPublications.add(publication);
    }

    public void linkToProject(Dataset project) {
        linkedProjects.add(project);
    }

    // Getters and setters omitted for brevity
}

