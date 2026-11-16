public class Main {
    public static void main(String[] args) {
        EmergencyContact emergencyContact = new EmergencyContact("123-456-7890");
        HomeCareNurse homeCareNurse = new HomeCareNurse("987-654-3210");
        Medication medication1 = new Medication("Aspirin", 1);
        Medication medication2 = new Medication("Ibuprofen", 2);

        OlderPerson olderPerson = new OlderPerson(emergencyContact, homeCareNurse);
        olderPerson.takeMedication(medication1);
        olderPerson.takeMedication(medication2);

        FallDetector fallDetector = new FallDetector(olderPerson);
        fallDetector.detectFall();
    }
}
