// File: OlderPerson.java
public class OlderPerson {
    private String name;
    private int age;
    private ALFRED alfred;

    public OlderPerson(String name, int age) {
        this.name = name;
        this.age = age;
        this.alfred = new ALFRED();
    }

    public void useALFRED() {
        alfred.showWhoIsAtDoor();
        alfred.pickUpPhone();
        alfred.toggleLights();
        alfred.controlHeating();
        alfred.controlTV();
        alfred.watchMovies();
        alfred.getNews();
        alfred.doGroceryShopping();
    }
}
