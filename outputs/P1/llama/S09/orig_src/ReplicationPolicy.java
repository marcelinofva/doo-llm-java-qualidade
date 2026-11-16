// File: ReplicationPolicy.java

public class ReplicationPolicy {
    private boolean replicate;
    private boolean replicateBeyondPrimary;

    public ReplicationPolicy(boolean replicate, boolean replicateBeyondPrimary) {
        this.replicate = replicate;
        this.replicateBeyondPrimary = replicateBeyondPrimary;
    }

    public boolean isReplicate() {
        return replicate;
    }

    public boolean isReplicateBeyondPrimary() {
        return replicateBeyondPrimary;
    }
}
