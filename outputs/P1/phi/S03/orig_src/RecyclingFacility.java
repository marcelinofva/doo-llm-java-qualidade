// File: RecyclingFacility.java
public class RecyclingFacility {
    private String facilityName;
    private String typeOfWaste;
    private String address;
    private String openingHours;

    public RecyclingFacility(String facilityName, String typeOfWaste, String address, String openingHours) {
        this.facilityName = facilityName;
        this.typeOfWaste = typeOfWaste;
        this.address = address;
        this.openingHours = openingHours;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getTypeOfWaste() {
        return typeOfWaste;
    }

    public void setTypeOfWaste(String typeOfWaste) {
        this.typeOfWaste = typeOfWaste;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }
}

