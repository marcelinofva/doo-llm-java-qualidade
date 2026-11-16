// File: HomeCareNurse.java

public class HomeCareNurse {
    private String name;
    private String contactInformation;

    public HomeCareNurse(String name) {
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
