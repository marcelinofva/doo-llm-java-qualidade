public class Main {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setIdentifier("A123");

        Subject subject = new Subject();
        subject.setIdentifier("S456");
        subject.addAgent(agent);

        Source source = new Source();
        source.setIdentifier("S789");
        source.addAgent(agent);

        Accession accession = new Accession();
        accession.setIdentifier("AC101");
        accession.addAgent(agent);

        Resource resource = new Resource();
        resource.setIdentifier("R202");
        resource.addAgent(agent);

        ResourceComponent resourceComponent = new ResourceComponent();
        resourceComponent.setIdentifier("RC303");
        resourceComponent.addAgent(agent);

        agent.addSubject(subject);
        agent.addSource(source);
        agent.addAccession(accession);
        agent.addResource(resource);
        agent.addResourceComponent(resourceComponent);

        System.out.println("Agent: " + agent.getIdentifier());
        System.out.println("Subjects: " + agent.getSubjects());
        System.out.println("Sources: " + agent.getSources());
        System.out.println("Accessions: " + agent.getAccessions());
        System.out.println("Resources: " + agent.getResources());
        System.out.println("Resource Components: " + agent.getResourceComponents());
    }
}
