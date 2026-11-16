// File: Estimator.java

public class Estimator {
    private String name;
    private Game game;

    public Estimator(String name) {
        this.name = name;
    }

    public void joinGame(Game game) {
        this.game = game;
        game.addEstimator(this);
    }

    public void makeEstimate(Item item, int estimate) {
        // make an estimate for the given item
    }
}
