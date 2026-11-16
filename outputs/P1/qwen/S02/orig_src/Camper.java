public class Camper {
    private String name;
    private Parent parent;

    public Camper(String name, Parent parent) {
        this.name = name;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public Parent getParent() {
        return parent;
    }
}
