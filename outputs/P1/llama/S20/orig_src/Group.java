// File: Group.java

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<File> files;
    private List<FileRestriction> restrictions;

    public Group(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.restrictions = new ArrayList<>();
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void removeFile(File file) {
        this.files.remove(file);
    }

    public List<File> getFiles() {
        return this.files;
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
