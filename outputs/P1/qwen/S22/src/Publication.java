public class Publication {
    private String id;
    private String title;
    private int citationCount;

    public Publication(String id, String title) {
        this.id = id;
        this.title = title;
        this.citationCount = 0;
    }

    public void updateCitationCount() {
        citationCount++;
    }
}
