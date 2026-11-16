// File: Person.java

public class Person {
    private String name;
    private Door door;
    private Phone phone;
    private Light light;
    private Heating heating;
    private TV tv;
    private Radio radio;
    private MoviePlayer moviePlayer;
    private NewsReader newsReader;
    private GroceryShopper groceryShopper;

    public Person(String name) {
        this.name = name;
    }

    public void openDoor() {
        door.open();
    }

    public void pickUpPhone() {
        phone.makeCall();
    }

    public void turnOnLight() {
        light.turnOn();
    }

    public void turnOffLight() {
        light.turnOff();
    }

    public void controlHeating() {
        heating.turnOn();
    }

    public void controlTV() {
        tv.turnOn();
    }

    public void controlRadio() {
        radio.turnOn();
    }

    public void playMovie() {
        moviePlayer.playMovie();
    }

    public void readNews() {
        newsReader.readNews();
    }

    public void shopGroceries() {
        groceryShopper.shopGroceries();
    }
}
