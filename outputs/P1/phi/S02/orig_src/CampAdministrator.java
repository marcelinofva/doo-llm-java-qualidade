// File: CampAdministrator.java
public class CampAdministrator {
    private List<CampGroup> groups = new ArrayList<>();
    private List<Parent> parents = new ArrayList<>();
    private List<Campers> campers = new ArrayList<>();
    private List<Staff> staff = new ArrayList<>();

    public void addCampers(Campers campers) {
        this.campers.add(campers);
    }

    public void addParents(Parent parents) {
        this.parents.add(parents);
    }

    public void createGroup(Campers campers) {
        Campers newCampers = new Campers(campers);
        groups.add(newCampers);
    }

    public void assignStaff(Staff staff) {
        this.staff.add(staff);
    }

    public void assignCampersToGroup(Campers campers, Campers group) {
        groups.get(groups.indexOf(group)).add(campers);
    }

    public void scheduleActivities(Campers campers, String activity, String date) {
        campers.get(campers.indexOf(campers)).scheduleActivity(activity, date);
    }

    public void logAttendance(Campers campers, boolean present) {
        campers.get(campers.indexOf(campers)).logAttendance(present);
    }

    public void assignPositions(Staff staff, String position) {
        staff.get(staff.indexOf(staff)).assignPosition(position);
    }
}

class Campers {
    private String name;
    private List<Activity> activities = new ArrayList<>();

    public Campers(Campers campers) {
        this.name = campers.get(campers.indexOf(campers)).name;
    }

    public void scheduleActivity(String activity, String date) {
        activities.add(new Activity(activity, date));
    }

    public void logAttendance(boolean present) {
        System.out.println(name + " attendance: " + present);
    }
}

class Parent {
    private String name;
    private List<Campers> campers = new ArrayList<>();

    public void enrollCampers(Campers campers) {
        campers.add(new Campers(campers));
        campers.get(campers.indexOf(campers)).enroll(this);
    }
}

class CampGroup extends Campers {
}

class Staff {
    private String name;
    private String position;

    public Staff(String name) {
        this.name = name;
    }

    public void assignPosition(String position) {
        this.position = position;
    }
}

class Activity {
    private String name;
    private String date;

    public Activity(String name, String date) {
        this.name = name;
        this.date = date;
    }
}

class Main {
    public static void main(String[] args) {
        CampAdministrator admin = new CampAdministrator();
        Parent parent = new Parent();
        parent.enrollCampers(new Campers("John Doe"));
        Campers campers = new Campers("John Doe");
        admin.addCampers(campers);
        admin.createGroup(campers);
        admin.assignStaff(new Staff("Jane Smith"));
        admin.assignPositions(admin.staff.get(0), "Counselor");
        admin.scheduleActivities(campers, "Swimming", "2022-01-01");
        admin.logAttendance(campers, true);
    }
}
