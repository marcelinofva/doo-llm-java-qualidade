// File: Location.java

public class Location {
    private String locationType;
    private String locationValue;

    public Location(String type, String value) {
        this.locationType = type;
        this.locationValue = value;
    }

    public String getLocationType() {
        return locationType;
    }

    public String getLocationValue() {
        return locationValue;
    }
}
