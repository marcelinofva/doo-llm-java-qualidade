// File: BatchIngest.java

public class BatchIngest {
    private Repository repository;

    public BatchIngest(Repository repository) {
        this.repository = repository;
    }

    public void performIngest(List<ETD> etds) {
        for (ETD etd : etds) {
            repository.addETD(etd);
        }
    }
}
