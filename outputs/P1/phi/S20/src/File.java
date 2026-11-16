// File: File.java
public class File {
    private String name;
    private boolean isRestricted;
    private String restrictedUntil;
    private String detailedRestrictions;
    private String restrictedByIP;
    private String restrictedByUser;

    public File(String name) {
        this.name = name;
    }

    public void setRestricted(boolean restricted) {
        isRestricted = restricted;
    }

    public void setRestrictedUntil(String restrictedUntil) {
        this.restrictedUntil = restrictedUntil;
    }

    public void setDetailedRestrictions(String detailedRestrictions) {
        this.detailedRestrictions = detailedRestrictions;
    }

    public void setRestrictedByIP(String restrictedByIP) {
        this.restrictedByIP = restrictedByIP;
    }

    public void setRestrictedByUser(String restrictedByUser) {
        this.restrictedByUser = restrictedByUser;
    }

    @Override
    public String toString() {
        return "File: " + name + "\n" +
                "Restricted: " + isRestricted + "\n" +
                "Restricted Until: " + restrictedUntil + "\n" +
                "Detailed Restrictions: " + detailedRestrictions + "\n" +
                "Restricted By IP: " + restrictedByIP + "\n" +
                "Restricted By User: " + restrictedByUser + "\n";
    }
}
