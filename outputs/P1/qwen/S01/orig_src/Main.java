public class Main {
    public static void main(String[] args) {
        Game game = new Game("Planning Poker Game", "A game for estimating items");
        game.invitePlayer("Alice");
        game.invitePlayer("Bob");
        game.invitePlayer("Charlie");

        game.startRound("Feature X");
        game.getPlayers().get(0).estimate("1");
        game.getPlayers().get(1).estimate("2");
        game.getPlayers().get(2).estimate("3");

        game.showEstimates();
    }
}
