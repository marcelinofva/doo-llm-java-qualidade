public class OlderPerson {
    private Alfred alfred;

    public OlderPerson(Alfred alfred) {
        this.alfred = alfred;
    }

    public void useAlfred() {
        alfred.seeDoor();
        alfred.pickUpPhone();
        alfred.turnOnLight();
        alfred.controlHeating();
        alfred.controlTV();
        alfred.controlRadio();
        alfred.playMovie();
        alfred.readNews();
        alfred.doGroceryShopping();
    }
}
