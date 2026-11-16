// File: Main.java

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        NewsItem newsItem = new NewsItem("Title", "Content", new Date(), new Date(), 1);
        NewsFeed newsFeed = new NewsFeed();
        newsFeed.addNewsItem(newsItem);

        SiteMember siteMember = new SiteMember("John");
        siteMember.setNewsFeed(newsFeed);

        NewsSite newsSite = new NewsSite();
        newsSite.addNewsItem(newsItem);

        System.out.println("News Item: " + newsItem.getTitle());
        System.out.println("News Feed: " + newsFeed.getNewsItems());
        System.out.println("Site Member: " + siteMember.getName());
        System.out.println("News Site: " + newsSite.getNewsItems());
    }
}
