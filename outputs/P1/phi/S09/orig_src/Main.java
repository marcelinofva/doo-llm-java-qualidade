// File: Main.java
public class Main {
    public static void main(String[] args) {
        RepositoryManager manager = new RepositoryManager();
        manager.addCollection("Collection1", new Collection("Collection1"));
        manager.addRemoteSite("RemoteSite1", new RemoteSite("RemoteSite1"));
        manager.setRemoteReplicationPolicy("Collection1", manager.remoteSites.get("RemoteSite1"), true);
        manager.displayDashboardStatistics();
    }
}
