// File: ResourceComponent.java

public class ResourceComponent {
    private String resourceComponentId;
    private String resourceComponentName;
    private List<Agent> agents;
    private List<Subject> subjects;

    public ResourceComponent(String resourceComponentId, String resourceComponentName) {
        this.resourceComponentId = resourceComponentId;
        this.resourceComponentName = resourceComponentName;
        this.agents = new ArrayList<>();
        this.subjects = new ArrayList<>();
    }

    public String getResourceComponentId() {
        return resourceComponentId;
    }

    public String getResourceComponentName() {
        return resourceComponentName;
    }

    public void addAgent(Agent agent) {
        this.agents.add(agent);
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
}
