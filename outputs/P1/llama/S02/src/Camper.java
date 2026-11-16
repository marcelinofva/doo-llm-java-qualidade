// File: Camper.java

public class Camper {
    private String name;
    private String id;
    private Group group;

    public Camper(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void enroll(Group group) {
        this.group = group;
    }

    public void attend() {
        System.out.println(name + " is attending the camp.");
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Group getGroup() {
        return group;
    }
}
