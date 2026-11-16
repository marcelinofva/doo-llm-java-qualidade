// File: Item.java
public class Item {
    private String title;
    private String embargoDate;
    private String metadata;

    public Item(String title, String embargoDate, String metadata) {
        this.title = title;
        this.embargoDate = embargoDate;
        this.metadata = metadata;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmbargoDate() {
        return embargoDate;
    }

    public void setEmbargoDate(String embargoDate) {
        this.embargoDate = embargoDate;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
}

