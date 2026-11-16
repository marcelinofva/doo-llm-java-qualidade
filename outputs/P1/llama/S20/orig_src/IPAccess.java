// File: IPAccess.java

import java.util.ArrayList;
import java.util.List;

public class IPAccess {
    private String ip;
    private List<File> files;

    public IPAccess(String ip) {
        this.ip = ip;
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
