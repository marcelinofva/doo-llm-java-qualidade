import java.util.ArrayList;
import java.util.List;

public class Trainer extends Member {
    private List<Class> upcomingClasses = new ArrayList<>();

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<Class> getUpcomingClasses() {
        return upcomingClasses;
    }

    public void addClass(Class clazz) {
        upcomingClasses.add(clazz);
    }
}
