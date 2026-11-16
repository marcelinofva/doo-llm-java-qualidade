// File: Agent.java

public class Agent {
    private String agentId;
    private String agentName;
    private List<NameForm> nameForms;
    private List<Source> sources;

    public Agent(String agentId, String agentName) {
        this.agentId = agentId;
        this.agentName = agentName;
        this.nameForms = new ArrayList<>();
        this.sources = new ArrayList<>();
    }

    public String getAgentId() {
        return agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void addNameForm(NameForm nameForm) {
        this.nameForms.add(nameForm);
    }

    public void addSource(Source source) {
        this.sources.add(source);
    }
}
