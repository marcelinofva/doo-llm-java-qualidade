// File: Main.java
public class Main {
    public static void main(String[] args) {
        OlderPerson olderPerson = new OlderPerson("John Doe", "123-456-7890");
        olderPerson.contactEmergency();
        olderPerson.receiveMedicineReminder();
        olderPerson.takeMedicine();
        olderPerson.detectFall();
        olderPerson.sendEmergency();
        olderPerson.receiveHomeCareNurse();
        olderPerson.checkMedicineTaken();
        olderPerson.checkFallDetected();

        MedicalCaregiver medicalCaregiver = new MedicalCaregiver("Jane Smith");
        medicalCaregiver.makeVideoCall();
        medicalCaregiver.checkIfPatientHasTakenMedicine();
    }
}
