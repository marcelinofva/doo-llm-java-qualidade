// File: NewsItem.java

public class NewsItem {
    private String title;
    private String content;
    private Date startDate;
    private Date endDate;
    private int priority;

    public NewsItem(String title, String content, Date startDate, Date endDate, int priority) {
        this.title = title;
        this.content = content;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priority = priority;
    }

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
