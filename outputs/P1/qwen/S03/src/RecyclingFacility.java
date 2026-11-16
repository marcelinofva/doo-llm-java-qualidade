import java.util.Map;
public class RecyclingFacility extends Facility {
    private Map<WasteType, String> acceptedWasteTypes;

    public RecyclingFacility(String name, String address, Map<WasteType, String> acceptedWasteTypes) {
        super(name, address);
        this.acceptedWasteTypes = acceptedWasteTypes;
    }

    public String getHours() {
        // Implementation
        return "Hours";
    }

    public Map<WasteType, String> getAcceptedWasteTypes() {
        return acceptedWasteTypes;
    }
}
