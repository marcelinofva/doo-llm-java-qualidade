// File: DataPackage.java

public class DataPackage {
    private String name;
    private String schema;
    private List<Tag> tags;

    public DataPackage(String name, String schema) {
        this.name = name;
        this.schema = schema;
        this.tags = new ArrayList<>();
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
    }

    public Tag getTag(String tagName) {
        for (Tag tag : this.tags) {
            if (tag.getTagName().equals(tagName)) {
                return tag;
            }
        }
        return null;
    }

    public String getVersion(String tagName) {
        Tag tag = this.getTag(tagName);
        if (tag != null) {
            return tag.getTagName();
        }
        return null;
    }
}
