public class NewsItem {
    private String title;
    private String content;
    private int priority;
    private Date startPublishDate;
    private Date oldNewsDate;
    private Date stopPublishDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getStartPublishDate() {
        return startPublishDate;
    }

    public void setStartPublishDate(Date startPublishDate) {
        this.startPublishDate = startPublishDate;
    }

    public Date getOldNewsDate() {
        return oldNewsDate;
    }

    public void setOldNewsDate(Date oldNewsDate) {
        this.oldNewsDate = oldNewsDate;
    }

    public Date getStopPublishDate() {
        return stopPublishDate;
    }

    public void setStopPublishDate(Date stopPublishDate) {
        this.stopPublishDate = stopPublishDate;
    }

    public void sendEmailToEditor() {
        // Implementation to send email to editor
    }
}
