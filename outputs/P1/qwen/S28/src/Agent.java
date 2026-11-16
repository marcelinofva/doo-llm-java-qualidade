public class Agent {
    private String identifier;
    private List<Subject> subjects = new ArrayList<>();
    private List<Source> sources = new ArrayList<>();
    private List<Accession> accessions = new ArrayList<>();
    private List<Resource> resources = new ArrayList<>();
    private List<ResourceComponent> resourceComponents = new ArrayList<>();

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void addSource(Source source) {
        sources.add(source);
    }

    public void addAccession(Accession accession) {
        accessions.add(accession);
    }

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    public void addResourceComponent(ResourceComponent resourceComponent) {
        resourceComponents.add(resourceComponent);
    }

    // Getters and setters
}
