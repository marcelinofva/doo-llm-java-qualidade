// File: Accession.java

public class Accession {
    private String accessionId;
    private String accessionName;
    private List<Agent> agents;
    private List<Subject> subjects;

    public Accession(String accessionId, String accessionName) {
        this.accessionId = accessionId;
        this.accessionName = accessionName;
        this.agents = new ArrayList<>();
        this.subjects = new ArrayList<>();
    }

    public String getAccessionId() {
        return accessionId;
    }

    public String getAccessionName() {
        return accessionName;
    }

    public void addAgent(Agent agent) {
        this.agents.add(agent);
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
}
