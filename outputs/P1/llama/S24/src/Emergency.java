// File: Emergency.java

public class Emergency {
    private Medication medication;
    private String contactInformation;

    public Emergency() {
        this.medication = new Medication();
        this.contactInformation = "";
    }

    public Medication getMedication() {
        return this.medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    public String getContactInformation() {
        return this.contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
}
