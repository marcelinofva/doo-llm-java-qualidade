// File: Source.java

public class Source {
    private String sourceId;
    private String sourceName;
    private Agent agent;

    public Source(String sourceId, String sourceName) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.agent = new Agent();
    }

    public String getSourceId() {
        return sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public Agent getAgent() {
        return agent;
    }
}
