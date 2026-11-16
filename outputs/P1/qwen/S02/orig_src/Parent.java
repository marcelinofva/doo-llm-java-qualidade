import java.util.ArrayList;
import java.util.List;

public class Parent {
    private String name;
    private List<Camper> campers = new ArrayList<>();

    public Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enrollCamper(Camper camper) {
        campers.add(camper);
    }

    public List<Camper> getCampers() {
        return campers;
    }
}
