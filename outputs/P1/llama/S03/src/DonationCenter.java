// File: DonationCenter.java

public class DonationCenter {
    private String id;
    private String name;
    private String address;
    private String donationTypes;

    public DonationCenter(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getDonationTypes() {
        return donationTypes;
    }

    public void setDonationTypes(String donationTypes) {
        this.donationTypes = donationTypes;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
