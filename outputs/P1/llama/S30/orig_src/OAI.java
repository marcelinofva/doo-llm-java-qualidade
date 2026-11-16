// File: OAI-PMH.java

public class OAI-PMH {
    private Repository repository;

    public OAI-PMH(Repository repository) {
        this.repository = repository;
    }

    public List<ETD> getETDs() {
        return repository.getETDs();
    }
}
