// File: Main.java

public class Main {
    public static void main(String[] args) {
        Resource resource = new Resource();
        ResourceComponent component = new ResourceComponent("Component Type", "Component Value");
        resource.addComponent(component);

        Instance instance = new Instance("Instance Type", "Instance Value");
        resource.addInstance(instance);

        Container container = new Container();
        container.addInstance(instance);

        Subject subject = new Subject("Subject Type", "Subject Value");
        resource.setLevelOfDescription("Level of Description", subject.getSubjectValue());

        Location location = new Location("Location Type", "Location Value");
        container.setLocation(location);

        Note note = new Note("Note Text");
        System.out.println(note.getNoteText());
    }
}
