// File: User.java

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<File> files;

    public User(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public void addAccess(File file) {
        this.files.add(file);
    }

    public void removeAccess(File file) {
        this.files.remove(file);
    }

    public List<File> getFiles() {
        return this.files;
    }
}
