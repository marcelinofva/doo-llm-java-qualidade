// File: Main.java

public class Main {
    public static void main(String[] args) {
        Game game = new Game("My Game", "This is my game");
        Moderator moderator = new Moderator(game);
        moderator.createGame("My Game", "This is my game");
        Estimator estimator = new Estimator("John");
        estimator.joinGame(game);
        Item item = new Item("Item 1");
        game.addItem(item);
        moderator.startRound(item);
        // demonstrate main flows using hard-coded data
    }
}
