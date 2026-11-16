import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsFeed {
    private List<NewsItem> newsItems;

    public NewsFeed() {
        this.newsItems = new ArrayList<>();
    }

    public void addNewsItem(NewsItem newsItem) {
        newsItems.add(newsItem);
    }

    public void removeNewsItem(NewsItem newsItem) {
        newsItems.remove(newsItem);
    }

    public List<NewsItem> getNewsItems() {
        return newsItems;
    }

    public List<NewsItem> getNewsItemsByDateRange(Date startDate, Date endDate) {
        List<NewsItem> filteredNewsItems = new ArrayList<>();
        for (NewsItem newsItem : newsItems) {
            if (newsItem.getStartPublishDate().after(startDate) && newsItem.getStopPublishDate().before(endDate)) {
                filteredNewsItems.add(newsItem);
            }
        }
        return filteredNewsItems;
    }
}
