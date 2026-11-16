// File: Content.java
public class Content {
    private String title;
    private String author;
    private String metadata;

    public Content(String title, String author, String metadata) {
        this.title = title;
        this.author = author;
        this.metadata = metadata;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getMetadata() {
        return metadata;
    }
}

