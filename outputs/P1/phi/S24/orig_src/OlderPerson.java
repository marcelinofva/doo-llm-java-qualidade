// File: OlderPerson.java
public class OlderPerson {
    private String name;
    private String emergencyContact;
    private boolean hasTakenMedicine;
    private boolean hasTakenMedicineReminder;
    private boolean hasTakenMedicine;
    private boolean hasDetectedFall;

    public OlderPerson(String name, String emergencyContact) {
        this.name = name;
        this.emergencyContact = emergencyContact;
        this.hasTakenMedicine = false;
        this.hasTakenMedicineReminder = false;
        this.hasTakenMedicine = false;
        this.hasDetectedFall = false;
    }

    public void contactEmergency() {
        System.out.println("OlderPerson " + name + " contacted emergency services.");
    }

    public void receiveMedicineReminder() {
        this.hasTakenMedicineReminder = true;
        System.out.println("OlderPerson " + name + " received a medicine reminder.");
    }

    public void takeMedicine() {
        this.hasTakenMedicine = true;
        System.out.println("OlderPerson " + name + " has taken medicine.");
    }

    public void detectFall() {
        this.hasDetectedFall = true;
        System.out.println("OlderPerson " + name + " detected a fall.");
    }

    public void sendEmergency() {
        System.out.println("OlderPerson " + name + " sent an emergency to " + emergencyContact + ".");
    }

    public void receiveHomeCareNurse() {
        System.out.println("OlderPerson " + name + " received a message that home care nurse is on the way.");
    }

    public void checkMedicineTaken() {
        if (!hasTakenMedicine) {
            System.out.println("OlderPerson " + name + " has not taken medicine yet.");
        } else {
            System.out.println("OlderPerson " + name + " has already taken medicine.");
        }
    }

    public void checkFallDetected() {
        if (hasDetectedFall) {
            System.out.println("OlderPerson " + name + " has detected a fall.");
        } else {
            System.out.println("OlderPerson " + name + " has not detected a fall.");
        }
    }
}

