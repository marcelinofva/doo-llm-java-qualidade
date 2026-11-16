// File: Embargo.java

public class Embargo {
    private Date startDate;
    private Date endDate;

    public Embargo(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
