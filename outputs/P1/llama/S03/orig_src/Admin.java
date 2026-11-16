// File: Admin.java

public class Admin {
    private List<RecyclingFacility> managedFacilities;
    private List<DonationCenter> managedCenters;

    public Admin() {
        this.managedFacilities = new ArrayList<>();
        this.managedCenters = new ArrayList<>();
    }

    public void addFacility(RecyclingFacility facility) {
        managedFacilities.add(facility);
    }

    public void removeFacility(RecyclingFacility facility) {
        managedFacilities.remove(facility);
    }

    public void addCenter(DonationCenter center) {
        managedCenters.add(center);
    }

    public void removeCenter(DonationCenter center) {
        managedCenters.remove(center);
    }

    public List<RecyclingFacility> getManagedFacilities() {
        return managedFacilities;
    }

    public List<DonationCenter> getManagedCenters() {
        return managedCenters;
    }
}
