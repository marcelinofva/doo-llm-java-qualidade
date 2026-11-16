// File: Alfred.java

public class Alfred {
    private Person person;

    public Alfred(Person person) {
        this.person = person;
    }

    public void interactWithPerson() {
        person.openDoor();
        person.pickUpPhone();
        person.turnOnLight();
        person.turnOffLight();
        person.controlHeating();
        person.controlTV();
        person.controlRadio();
        person.playMovie();
        person.readNews();
        person.shopGroceries();
    }
}
