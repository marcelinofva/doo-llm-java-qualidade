public class DataPackage {
    private String id;
    private String name;
    private String content;
    private String status;

    public DataPackage(String id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.status = "DRAFT";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public String getStatus() {
        return status;
    }

    public void publish() {
        this.status = "PUBLISHED";
    }

    public void unpublish() {
        this.status = "UNPUBLISHED";
    }

    public void delete() {
        this.status = "DELETED";
    }

    public void restore() {
        this.status = "PUBLISHED";
    }

    public void validate() {
        // Validation logic here
        System.out.println("Data package validated.");
    }
}
