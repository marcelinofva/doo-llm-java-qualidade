// File: RecyclingFacility.java

public class RecyclingFacility {
    private String id;
    private String name;
    private String address;
    private String hours;
    private List<String> acceptedWasteTypes;

    public RecyclingFacility(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.acceptedWasteTypes = new ArrayList<>();
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public List<String> getAcceptedWasteTypes() {
        return acceptedWasteTypes;
    }

    public void addAcceptedWasteType(String type) {
        acceptedWasteTypes.add(type);
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
