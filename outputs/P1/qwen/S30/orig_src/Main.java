import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Demonstrate main flows using hard-coded data
        List<ETD> etds = new ArrayList<>();
        ETD etd1 = new ETD();
        etd1.setTitle("Thesis Title");
        etd1.setAuthor("Author Name");
        etd1.setSubmissionDate(new Date());
        etd1.setEmbargo(new Embargo());
        etd1.getEmbargo().setEmbargoDate(new Date());
        etd1.setPermissions(new ArrayList<>());
        etd1.getPermissions().add("ROLE_ADMIN");
        etd1.getPermissions().add("ROLE_CURATION");
        etds.add(etd1);

        BatchIngestTool ingestTool = new BatchIngestTool();
        ingestTool.ingestETDs(etds);

        DescriptiveRecord record = new DescriptiveRecord();
        record.setETD(etd1);
        System.out.println(record.getDescriptiveRecord());

        AuthorAuthorityControl control = new AuthorAuthorityControl();
        control.controlAuthorAuthority(etd1);

        OAIRepository repository = new OAIRepository();
        repository.setRepositoryContents(etds);
        System.out.println(repository.getRepositoryContents());

        BatchSubmitter submitter = new BatchSubmitter();
        submitter.submitData(etds);

        Depositor depositor = new Depositor();
        System.out.println(depositor.getFeedback(etd1));
    }
}
