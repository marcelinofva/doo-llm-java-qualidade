// File: Main.java

public class Main {
    public static void main(String[] args) {
        OlderPerson olderPerson = new OlderPerson("John");
        MedicalCaregiver medicalCaregiver = new MedicalCaregiver("Jane");
        Caregiver caregiver = new Caregiver("Bob");
        HomeCareNurse homeCareNurse = new HomeCareNurse("Alice");
        Medication medication = new Medication("Painkiller");
        Emergency emergency = new Emergency();
        FallDetector fallDetector = new FallDetector();

        olderPerson.addMedication(medication);
        olderPerson.setCaregiver(caregiver);
        olderPerson.setHomeCareNurse(homeCareNurse);

        medicalCaregiver.addOlderPerson(olderPerson);

        caregiver.setContactInformation("123-456-7890");
        homeCareNurse.setContactInformation("987-654-3210");

        medication.setEmergency(emergency);
        emergency.setMedication(medication);
        emergency.setContactInformation("555-123-4567");

        fallDetector.detectFall();
        fallDetector.sendEmergency();

        olderPerson.requestUrgentHelp();
        olderPerson.receiveMessage();

        medicalCaregiver.getVideoCall();
    }
}
