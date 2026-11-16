public class Meeting {
    private String title;
    private String time;
    private String location;

    public Meeting(String title, String time, String location) {
        this.title = title;
        this.time = time;
        this.location = location;
    }

    public void setDetails(String title, String time, String location) {
        this.title = title;
        this.time = time;
        this.location = location;
    }

    public String getDetails() {
        return "Title: " + title + ", Time: " + time + ", Location: " + location;
    }
}
