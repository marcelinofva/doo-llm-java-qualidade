// File: File.java

public class File {
    private String name;
    private List<FileRestriction> restrictions;

    public File(String name) {
        this.name = name;
        this.restrictions = new ArrayList<>();
    }

    public void addRestriction(FileRestriction restriction) {
        this.restrictions.add(restriction);
    }

    public void removeRestriction(FileRestriction restriction) {
        this.restrictions.remove(restriction);
    }

    public List<FileRestriction> getRestrictions() {
        return this.restrictions;
    }
}
