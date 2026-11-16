// File: Group.java

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Camper> campers;
    private List<Activity> activities;

    public Group(String name) {
        this.name = name;
        this.campers = new ArrayList<>();
        this.activities = new ArrayList<>();
    }

    public void addCamper(Camper camper) {
        campers.add(camper);
    }

    public void scheduleActivity(Activity activity) {
        activities.add(activity);
    }

    public String getName() {
        return name;
    }

    public List<Camper> getCampers() {
        return campers;
    }

    public List<Activity> getActivities() {
        return activities;
    }
}
