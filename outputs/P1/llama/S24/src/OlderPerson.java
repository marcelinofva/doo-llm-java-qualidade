// File: OlderPerson.java

public class OlderPerson {
    private String name;
    private List<Medication> medications;
    private Caregiver caregiver;
    private HomeCareNurse homeCareNurse;

    public OlderPerson(String name) {
        this.name = name;
        this.medications = new ArrayList<>();
    }

    public void addMedication(Medication medication) {
        this.medications.add(medication);
    }

    public List<Medication> getMedications() {
        return this.medications;
    }

    public Caregiver getCaregiver() {
        return this.caregiver;
    }

    public void setCaregiver(Caregiver caregiver) {
        this.caregiver = caregiver;
    }

    public HomeCareNurse getHomeCareNurse() {
        return this.homeCareNurse;
    }

    public void setHomeCareNurse(HomeCareNurse homeCareNurse) {
        this.homeCareNurse = homeCareNurse;
    }

    public void requestUrgentHelp() {
        // send request to caregiver
    }

    public void receiveMessage() {
        // receive message from home care nurse
    }
}
