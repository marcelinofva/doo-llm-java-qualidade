public class Main {
    public static void main(String[] args) {
        Resource resource = new Resource("R1");
        ResourceComponent component = new ResourceComponent("C1");
        Instance instance = new Instance();
        Container container = new Container();
        Location location = new Location();
        Subject subject = new Subject();
        Note note = new Note();

        resource.assignComponentId(component, "C1");
        resource.setLevelOfDescription("Item");
        resource.addInstance(instance);
        resource.addSubject(subject);
        resource.addNote(note);

        instance.associateWithContainer(container);
        container.setLocation(location);
        location.setLocationDetails("Shelf A, Box 1");

        System.out.println("Resource ID: " + resource.id);
        System.out.println("Component ID: " + component.id);
        System.out.println("Level of Description: " + resource.levelOfDescription);
        System.out.println("Container Location: " + location.details);
    }
}
