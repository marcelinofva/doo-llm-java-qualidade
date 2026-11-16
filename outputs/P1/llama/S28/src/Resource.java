// File: Resource.java

public class Resource {
    private String resourceId;
    private String resourceName;
    private List<Agent> agents;
    private List<Subject> subjects;

    public Resource(String resourceId, String resourceName) {
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.agents = new ArrayList<>();
        this.subjects = new ArrayList<>();
    }

    public String getResourceId() {
        return resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void addAgent(Agent agent) {
        this.agents.add(agent);
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
}
