public class FallDetector {
    private OlderPerson olderPerson;

    public FallDetector(OlderPerson olderPerson) {
        this.olderPerson = olderPerson;
    }

    public void detectFall() {
        // Detect fall and send emergency alert
        olderPerson.requestHelp();
    }
}
