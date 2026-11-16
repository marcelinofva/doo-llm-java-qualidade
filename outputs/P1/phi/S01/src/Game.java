// File: Game.java
import java.util.ArrayList;
import java.util.List;
public class Game {
    private String name;
    private String description;
    private List<Round> rounds;

    public Game(String name, String description) {
        this.name = name;
        this.description = description;
        this.rounds = new ArrayList<>();
    }

    public void addRound(Round round) {
        rounds.add(round);
    }

    public void startGame() {
        for (Round round : rounds) {
            round.start();
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Round> getRounds() {
        return rounds;
    }
}

class Round {
    private String item;
    private List<Estimator> estimators;
    private List<Integer> estimates;

    public Round(String item) {
        this.item = item;
        this.estimators = new ArrayList<>();
        this.estimates = new ArrayList<>();
    }

    public void start() {
        System.out.println("Starting round for item: " + item);
        for (Estimator estimator : estimators) {
            estimator.join();
        }
    }

    public void addEstimator(Estimator estimator) {
        estimators.add(estimator);
    }

    public void showEstimates() {
        System.out.println("Estimates for item: " + item);
        for (Integer estimate : estimates) {
            System.out.println(estimate);
        }
    }

    public void enterEstimate(int estimate) {
        estimates.add(estimate);
    }

    public String getItem() {
        return item;
    }

    public List<Estimator> getEstimators() {
        return estimators;
    }
}

class Estimator {
    private String name;

    public Estimator(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println("Estimator " + name + " joined the game.");
    }

    public void changeEstimate(int newEstimate) {
        System.out.println("Estimator " + name + " changed their estimate to: " + newEstimate);
    }
}

class Main {
    public static void main(String[] args) {
        Game game = new Game("Planning Poker", "A game to estimate tasks");
        Round round1 = new Round("Implement feature X");
        round1.addEstimator(new Estimator("Alice"));
        round1.addEstimator(new Estimator("Bob"));
        round1.enterEstimate(5);
        round1.enterEstimate(8);
        round1.showEstimates();
        game.addRound(round1);
        game.startGame();
    }
}
