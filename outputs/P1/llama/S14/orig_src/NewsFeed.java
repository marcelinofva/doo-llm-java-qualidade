// File: NewsFeed.java

import java.util.ArrayList;
import java.util.List;

public class NewsFeed {
    private List<NewsItem> newsItems;

    public NewsFeed() {
        this.newsItems = new ArrayList<>();
    }

    public void addNewsItem(NewsItem newsItem) {
        this.newsItems.add(newsItem);
    }

    public void removeNewsItem(NewsItem newsItem) {
        this.newsItems.remove(newsItem);
    }

    public List<NewsItem> getNewsItems() {
        return newsItems;
    }

    public void setNewsItems(List<NewsItem> newsItems) {
        this.newsItems = newsItems;
    }
}
