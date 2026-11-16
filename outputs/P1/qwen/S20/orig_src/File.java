public class File {
    private String content;
    private Restriction restriction;

    public void markAsRestricted() {
        restriction = new Restriction();
    }

    public void addRestriction(Restriction restriction) {
        this.restriction = restriction;
    }

    public void redactContent() {
        if (restriction instanceof Redaction) {
            ((Redaction) restriction).applyRedaction();
        }
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
