// File: Parent.java

public class Parent {
    private String name;
    private String id;
    private Camper child;

    public Parent(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void enrollChild(Camper child) {
        this.child = child;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Camper getChild() {
        return child;
    }
}
