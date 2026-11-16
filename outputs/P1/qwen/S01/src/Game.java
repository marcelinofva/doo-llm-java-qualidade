import java.util.ArrayList;
import java.util.List;

public class Game {
    private String name;
    private String description;
    private List<Round> rounds;
    private List<Player> players;
    private GameURL gameURL;

    public Game(String name, String description) {
        this.name = name;
        this.description = description;
        this.rounds = new ArrayList<>();
        this.players = new ArrayList<>();
        this.gameURL = new GameURL(this);
    }

    public void invitePlayer(String playerName) {
        players.add(new Player(playerName));
    }

    public void startRound(String item) {
        Round round = new Round(item);
        rounds.add(round);
    }

    public void showEstimates() {
        for (Round round : rounds) {
            System.out.println("Item: " + round.getItem());
            for (Estimation estimation : round.getEstimations()) {
                System.out.println(estimation.getPlayer().getName() + ": " + estimation.getEstimate());
            }
        }
    }

    public void finalizeEstimates(String agreedEstimate) {
        // Logic to finalize estimates
    }

    public String getGameURL() {
        return gameURL.generateURL();
    }
}
