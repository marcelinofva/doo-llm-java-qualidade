import java.util.List;

public class User {
    private List<NewsFeed> subscribedFeeds;

    public User() {
        this.subscribedFeeds = new ArrayList<>();
    }

    public void subscribeToFeed(NewsFeed feed) {
        subscribedFeeds.add(feed);
    }

    public void unsubscribeFromFeed(NewsFeed feed) {
        subscribedFeeds.remove(feed);
    }

    public List<NewsFeed> getSubscribedFeeds() {
        return subscribedFeeds;
    }
}
