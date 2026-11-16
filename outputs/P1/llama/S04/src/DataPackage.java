// File: DataPackage.java

public class DataPackage {
    private String id;
    private String name;
    private Publisher publisher;

    public DataPackage(String id, String name, Publisher publisher) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
    }

    public void update() {
        // update logic
    }

    public void delete() {
        // delete logic
    }

    public Publisher getPublisher() {
        return publisher;
    }
}
