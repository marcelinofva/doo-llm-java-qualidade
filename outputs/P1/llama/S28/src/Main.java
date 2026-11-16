// File: Main.java

public class Main {
    public static void main(String[] args) {
        // create agent
        Agent agent = new Agent("agent1", "John Doe");

        // create subject
        Subject subject = new Subject("subject1", "History");

        // create accession
        Accession accession = new Accession("accession1", "Accession 1");

        // create resource
        Resource resource = new Resource("resource1", "Resource 1");

        // create resource component
        ResourceComponent resourceComponent = new ResourceComponent("resourceComponent1", "Resource Component 1");

        // create name form
        NameForm nameForm = new NameForm("nameForm1", "Name Form 1");

        // create source
        Source source = new Source("source1", "Source 1");

        // add agent to accession
        accession.addAgent(agent);

        // add subject to accession
        accession.addSubject(subject);

        // add agent to resource
        resource.addAgent(agent);

        // add subject to resource
        resource.addSubject(subject);

        // add agent to resource component
        resourceComponent.addAgent(agent);

        // add subject to resource component
        resourceComponent.addSubject(subject);

        // add name form to agent
        agent.addNameForm(nameForm);

        // add source to agent
        agent.addSource(source);
    }
}
