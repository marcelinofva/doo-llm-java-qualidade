import java.util.Date;

public class Main {
    public static void main(String[] args) {
        NewsItem newsItem = new NewsItem();
        newsItem.setTitle("New Scrum Alliance News");
        newsItem.setContent("Latest updates on Scrum Alliance...");
        newsItem.setPriority(1);
        newsItem.setStartPublishDate(new Date());
        newsItem.setStopPublishDate(new Date(System.currentTimeMillis() + 86400000)); // 1 day from now
        newsItem.sendEmailToEditor();

        NewsFeed newsFeed = new NewsFeed();
        newsFeed.addNewsItem(newsItem);

        User user = new User();
        user.subscribeToFeed(newsFeed);

        Editor editor = new Editor();
        editor.addNewsItem(newsItem);

        Subscriber subscriber = new Subscriber();
        subscriber.receiveNewsItems();
    }
}
