import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Camper> campers = new ArrayList<>();
    private List<Activity> activities = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCamper(Camper camper) {
        campers.add(camper);
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Camper> getCampers() {
        return campers;
    }

    public List<Activity> getActivities() {
        return activities;
    }
}
