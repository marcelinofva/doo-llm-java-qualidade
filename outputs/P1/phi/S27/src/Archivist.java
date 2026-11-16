// File: Archivist.java
public class Archivist {
    public static void main(String[] args) {
        Resource resource = new Resource();
        resource.assignComponentIdentifier("RC001");
        resource.assignLevelOfDescription("Level1");
        resource.associateInstance("Instance001");
        resource.createEditRecord();
        resource.associateSubjectRecord("Subject001");
        resource.associateInstanceWithContainer("Container001");
        resource.assignLocation("Location001");
        resource.addNotes("Note001");
        System.out.println(resource);
    }
}

class Resource {
    private String componentIdentifier;
    private String levelOfDescription;
    private String instance;
    private String subjectRecord;
    private String container;
    private String location;
    private String notes;

    public void assignComponentIdentifier(String identifier) {
        this.componentIdentifier = identifier;
    }

    public void assignLevelOfDescription(String level) {
        this.levelOfDescription = level;
    }

    public void associateInstance(String instance) {
        this.instance = instance;
    }

    public void createEditRecord() {
        System.out.println("Record created/edited");
    }

    public void associateSubjectRecord(String subject) {
        this.subjectRecord = subject;
    }

    public void associateInstanceWithContainer(String container) {
        this.container = container;
    }

    public void assignLocation(String location) {
        this.location = location;
    }

    public void addNotes(String note) {
        this.notes = note;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "componentIdentifier='" + componentIdentifier + '\'' +
                ", levelOfDescription='" + levelOfDescription + '\'' +
                ", instance='" + instance + '\'' +
                ", subjectRecord='" + subjectRecord + '\'' +
                ", container='" + container + '\'' +
                ", location='" + location + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
