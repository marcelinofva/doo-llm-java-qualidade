import java.util.Date;
import java.util.List;

public class Attendance {
    private Date date;
    private List<Camper> campers = new ArrayList<>();

    public Attendance(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void logCamper(Camper camper) {
        campers.add(camper);
    }

    public List<Camper> getCampers() {
        return campers;
    }
}
