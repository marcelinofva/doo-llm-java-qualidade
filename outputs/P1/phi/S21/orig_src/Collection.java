// File: Collection.java
public class Collection {
    private String name;
    private String branding;
    private List<Content> contents;

    public Collection(String name, String branding) {
        this.name = name;
        this.branding = branding;
        this.contents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getBranding() {
        return branding;
    }

    public void addContent(Content content) {
        contents.add(content);
    }

    public List<Content> getContents() {
        return contents;
    }
}

