import java.util.ArrayList;
import java.util.List;
public class RepositoryManager {
    private List<RemoteReplicationPolicy> policies;
    private EncryptionService encryptionService;

    public RepositoryManager() {
        this.policies = new ArrayList<>();
        this.encryptionService = new EncryptionService();
    }

    public void setReplicationPolicy(RemoteReplicationPolicy policy) {
        policies.add(policy);
    }

    public byte[] encryptFile(byte[] fileData) {
        return encryptionService.encrypt(fileData);
    }
}
