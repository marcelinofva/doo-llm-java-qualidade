// File: DigitalRecordsArchivist.java
public class DigitalRecordsArchivist {
    private String name;
    private String accessControlConfig;
    private String embargoMetadata;

    public DigitalRecordsArchivist(String name, String accessControlConfig, String embargoMetadata) {
        this.name = name;
        this.accessControlConfig = accessControlConfig;
        this.embargoMetadata = embargoMetadata;
    }

    public void liftEmbargoesOnReleaseDate() {
        System.out.println("Lifting embargoes on release date for " + name);
    }

    public void editEmbargoLength() {
        System.out.println("Editing embargo length for " + name);
    }

    public void grantEmbargoPrivileges() {
        System.out.println("Granting embargo privileges to other administrators");
    }

    public void viewAndDownloadEmbargoMetadata() {
        System.out.println("Viewing and downloading embargo metadata for " + name);
    }
}

