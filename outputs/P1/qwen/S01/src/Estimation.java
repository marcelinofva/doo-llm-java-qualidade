public class Estimation {
    private Player player;
    private String estimate;

    public Estimation(Player player, String estimate) {
        this.player = player;
        this.estimate = estimate;
    }

    public String getEstimate() {
        return estimate;
    }
}
