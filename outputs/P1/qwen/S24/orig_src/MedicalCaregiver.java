public class MedicalCaregiver {
    private EmergencyContact emergencyContact;
    private List<Medication> medications;

    public MedicalCaregiver(EmergencyContact emergencyContact) {
        this.emergencyContact = emergencyContact;
        this.medications = new ArrayList<>();
    }

    public void receiveAlert() {
        // Handle alert
    }

    public void trackMedication(Medication medication) {
        // Track medication intake
    }
}
