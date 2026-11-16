public class DataPackage {
    private String id;
    private List<Tag> tags;

    public DataPackage(String id) {
        this.id = id;
        this.tags = new ArrayList<>();
    }

    public void addTag(Tag tag) {
        tags.add(tag);
    }

    public Tag getTag(String tagId) {
        return tags.stream().filter(t -> t.getTagId().equals(tagId)).findFirst().orElse(null);
    }

    public List<Tag> getAllTags() {
        return tags;
    }

    public String getId() {
        return id;
    }
}
