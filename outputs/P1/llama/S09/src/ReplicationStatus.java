// File: ReplicationStatus.java

public class ReplicationStatus {
    private boolean replicated;
    private boolean replicatedBeyondPrimary;

    public ReplicationStatus(boolean replicated, boolean replicatedBeyondPrimary) {
        this.replicated = replicated;
        this.replicatedBeyondPrimary = replicatedBeyondPrimary;
    }

    public boolean isReplicated() {
        return replicated;
    }

    public boolean isReplicatedBeyondPrimary() {
        return replicatedBeyondPrimary;
    }
}
