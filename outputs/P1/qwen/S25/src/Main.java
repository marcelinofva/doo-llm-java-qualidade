public class Main {
    public static void main(String[] args) {
        Alfred alfred = new Alfred();
        OlderPerson olderPerson = new OlderPerson(alfred);
        olderPerson.useAlfred();
    }
}
