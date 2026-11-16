// File: Main.java

public class Main {
    public static void main(String[] args) {
        Repository repository = new Repository();
        ETD etd = new ETD("metadata", new File("file.txt"));
        repository.addETD(etd);

        BatchIngest batchIngest = new BatchIngest(repository);
        batchIngest.performIngest(List.of(etd));

        AuthorAuthorityControl authorAuthorityControl = new AuthorAuthorityControl(repository);
        authorAuthorityControl.performControl(List.of(etd));

        OAI-PMH oaiPMH = new OAI-PMH(repository);
        List<ETD> etds = oaiPMH.getETDs();
        for (ETD etd1 : etds) {
            System.out.println(etd1.getMetadata());
        }
    }
}
