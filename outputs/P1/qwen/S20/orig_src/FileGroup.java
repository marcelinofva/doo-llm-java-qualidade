import java.util.ArrayList;
import java.util.List;

public class FileGroup {
    private List<File> files;
    private Restriction restriction;

    public FileGroup() {
        files = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void markAsRestricted() {
        restriction = new Restriction();
    }

    public void addRestriction(Restriction restriction) {
        this.restriction = restriction;
    }

    public void uploadFiles() {
        // Logic to upload files
    }
}
