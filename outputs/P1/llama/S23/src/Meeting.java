// File: Meeting.java

public class Meeting {
    private String startTime;
    private String endTime;
    private String notes;

    public Meeting(String startTime, String endTime, String notes) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.notes = notes;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getNotes() {
        return notes;
    }
}
