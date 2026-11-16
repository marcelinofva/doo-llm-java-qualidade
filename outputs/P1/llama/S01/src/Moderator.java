// File: Moderator.java

public class Moderator {
    private Game game;

    public Moderator(Game game) {
        this.game = game;
    }

    public void createGame(String name, String description) {
        game = new Game(name, description);
    }

    public void inviteEstimators(String url) {
        // invite estimators to join the game
    }

    public void startRound(Item item) {
        game.startRound(item);
    }

    public void showEstimates() {
        game.showEstimates();
    }
}
