public class ResourceComponent {
    private String identifier;
    private List<Agent> agents = new ArrayList<>();

    public void addAgent(Agent agent) {
        agents.add(agent);
    }

    // Getters and setters
}
