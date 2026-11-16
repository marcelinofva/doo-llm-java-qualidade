// File: Caregiver.java

public class Caregiver {
    private String name;
    private String contactInformation;

    public Caregiver(String name) {
        this.name = name;
        this.contactInformation = "";
    }

    public String getContactInformation() {
        return this.contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
}
