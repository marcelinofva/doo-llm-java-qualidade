// File: MedicalCaregiver.java
public class MedicalCaregiver {
    private String name;

    public MedicalCaregiver(String name) {
        this.name = name;
    }

    public void makeVideoCall() {
        System.out.println("MedicalCaregiver " + name + " made a video call for emergency assistance.");
    }

    public void checkIfPatientHasTakenMedicine() {
        System.out.println("MedicalCaregiver " + name + " checked if the patient has taken medicine.");
    }
}

