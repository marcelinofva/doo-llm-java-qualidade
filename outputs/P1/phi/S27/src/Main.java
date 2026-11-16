// File: Main.java
public class Main {
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
