public class Alfred {
    private Door door;
    private Phone phone;
    private Light light;
    private Heating heating;
    private TV tv;
    private Radio radio;
    private MoviePlayer moviePlayer;
    private NewsReader newsReader;
    private GroceryShopping groceryShopping;

    public Alfred() {
        this.door = new Door();
        this.phone = new Phone();
        this.light = new Light();
        this.heating = new Heating();
        this.tv = new TV();
        this.radio = new Radio();
        this.moviePlayer = new MoviePlayer();
        this.newsReader = new NewsReader();
        this.groceryShopping = new GroceryShopping();
    }

    public void seeDoor() {
        door.open();
        System.out.println("Door is open.");
    }

    public void pickUpPhone() {
        phone.pickUp();
        System.out.println("Phone is picked up.");
    }

    public void turnOnLight() {
        light.turnOn();
        System.out.println("Light is on.");
    }

    public void turnOffLight() {
        light.turnOff();
        System.out.println("Light is off.");
    }

    public void controlHeating() {
        heating.setTemperature(22);
        System.out.println("Heating is set to 22°C.");
    }

    public void controlTV() {
        tv.turnOn();
        tv.changeChannel(5);
        System.out.println("TV is on and channel 5 is playing.");
    }

    public void controlRadio() {
        radio.turnOn();
        radio.changeStation(101.5);
        System.out.println("Radio is on and station 101.5 is playing.");
    }

    public void playMovie() {
        moviePlayer.playMovie();
        System.out.println("Movie is playing.");
    }

    public void readNews() {
        newsReader.readNews();
        System.out.println("News are being read.");
    }

    public void doGroceryShopping() {
        groceryShopping.shop();
        System.out.println("Grocery shopping is done.");
    }
}
