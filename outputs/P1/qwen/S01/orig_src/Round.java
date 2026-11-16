import java.util.ArrayList;
import java.util.List;

public class Round {
    private String item;
    private List<Estimation> estimations;

    public Round(String item) {
        this.item = item;
        this.estimations = new ArrayList<>();
    }

    public void addItem(String item) {
        this.item = item;
    }

    public void addEstimation(String playerName, String estimate) {
        estimations.add(new Estimation(new Player(playerName), estimate));
    }

    public String getItem() {
        return item;
    }

    public List<Estimation> getEstimations() {
        return estimations;
    }
}
