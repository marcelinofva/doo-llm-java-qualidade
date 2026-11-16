public class Resource {
    private String id;
    private String levelOfDescription;
    private List<ResourceComponent> components;
    private List<Instance> instances;
    private List<Subject> subjects;
    private List<Note> notes;

    public Resource(String id) {
        this.id = id;
        this.components = new ArrayList<>();
        this.instances = new ArrayList<>();
        this.subjects = new ArrayList<>();
        this.notes = new ArrayList<>();
    }

    public void assignComponentId(ResourceComponent component, String id) {
        component.setId(id);
    }

    public void setLevelOfDescription(String level) {
        this.levelOfDescription = level;
    }

    public void addInstance(Instance instance) {
        instances.add(instance);
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void addNote(Note note) {
        notes.add(note);
    }
}
