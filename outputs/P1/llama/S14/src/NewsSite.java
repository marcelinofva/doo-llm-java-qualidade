// File: NewsSite.java

import java.util.ArrayList;
import java.util.List;

public class NewsSite {
    private List<NewsItem> newsItems;

    public NewsSite() {
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
