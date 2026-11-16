// File: Game.java

import java.util.ArrayList;
import java.util.List;

public class Game {
    private String name;
    private String description;
    private List<Estimator> estimators;
    private List<Item> items;
    private Moderator moderator;

    public Game(String name, String description) {
        this.name = name;
        this.description = description;
        this.estimators = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public void inviteEstimators(String url) {
        // invite estimators to join the game
    }

    public void startRound(Item item) {
        // start a new round for the given item
    }

    public void showEstimates() {
        // show all estimates for the current round
    }

    public void addEstimator(Estimator estimator) {
        estimators.add(estimator);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void setModerator(Moderator moderator) {
        this.moderator = moderator;
    }
}
