public class OlderPerson {
    private EmergencyContact emergencyContact;
    private HomeCareNurse homeCareNurse;
    private List<Medication> medications;

    public OlderPerson(EmergencyContact emergencyContact, HomeCareNurse homeCareNurse) {
        this.emergencyContact = emergencyContact;
        this.homeCareNurse = homeCareNurse;
        this.medications = new ArrayList<>();
    }

    public void requestHelp() {
        emergencyContact.sendAlert();
        homeCareNurse.sendAlert();
    }

    public void takeMedication(Medication medication) {
        medication.intake();
    }

    public boolean checkMedicationStatus(Medication medication) {
        return medication.isTaken();
    }
}
