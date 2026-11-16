// File: Main.java

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John");
        Door door = new Door();
        Phone phone = new Phone();
        Light light = new Light();
        Heating heating = new Heating();
        TV tv = new TV();
        Radio radio = new Radio();
        MoviePlayer moviePlayer = new MoviePlayer();
        NewsReader newsReader = new NewsReader();
        GroceryShopper groceryShopper = new GroceryShopper();
        Alfred alfred = new Alfred(person);

        alfred.interactWithPerson();
    }
}
