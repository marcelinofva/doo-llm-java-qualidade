// File: FileRestriction.java

public class FileRestriction {
    private String type;
    private Date endDate;

    public FileRestriction(String type, Date endDate) {
        this.type = type;
        this.endDate = endDate;
    }

    public String getType() {
        return this.type;
    }

    public Date getEndDate() {
        return this.endDate;
    }
}
