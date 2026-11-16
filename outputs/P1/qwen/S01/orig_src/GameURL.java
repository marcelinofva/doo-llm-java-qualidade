public class GameURL {
    private Game game;

    public GameURL(Game game) {
        this.game = game;
    }

    public String generateURL() {
        // Logic to generate a unique URL
        return "http://example.com/game/" + game.getName();
    }
}
