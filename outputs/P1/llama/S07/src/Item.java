// File: Item.java

import java.util.Date;

public class Item {
    private String metadata;
    private Embargo embargo;

    public Item(String metadata) {
        this.metadata = metadata;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public Embargo getEmbargo() {
        return embargo;
    }

    public void setEmbargo(Embargo embargo) {
        this.embargo = embargo;
    }
}
