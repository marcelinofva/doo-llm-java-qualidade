// File: Publisher.java
public class Publisher {
    private String name;
    private String tag;
    private DataPackage currentPackage;
    private List<DataPackage> previousPackages;

    public Publisher(String name) {
        this.name = name;
        this.tag = null;
        this.currentPackage = null;
        this.previousPackages = new ArrayList<>();
    }

    public void createPackage(DataPackage package) {
        if (currentPackage != null && currentPackage.getTag().equals(package.getTag())) {
            System.out.println("Tag already exists. Overwriting is not allowed.");
        } else {
            this.currentPackage = package;
            this.previousPackages.add(package);
            System.out.println("Package created with tag: " + package.getTag());
        }
    }

    public void overwritePackage(DataPackage newPackage) {
        if (previousPackages.contains(newPackage)) {
            System.out.println("Cannot overwrite a previously tagged package. Use updatePackage instead.");
        } else {
            this.currentPackage = newPackage;
            this.tag = newPackage.getTag();
            System.out.println("Package overwritten with new tag: " + newPackage.getTag());
        }
    }

    public void updatePackage(DataPackage updatedPackage) {
        if (previousPackages.contains(updatedPackage)) {
            this.currentPackage = updatedPackage;
            System.out.println("Package updated with new tag: " + updatedPackage.getTag());
        } else {
            System.out.println("Package not found in previous versions. Use createPackage instead.");
        }
    }

    public DataPackage getPackageAtVersion(int version) {
        if (version < 0 || version >= previousPackages.size()) {
            System.out.println("Invalid version number.");
            return null;
        }
        return previousPackages.get(version);
    }

    public void viewPackageAtVersion(int version) {
        DataPackage package = getPackageAtVersion(version);
        if (package != null) {
            System.out.println("Viewing package at version " + version + ": " + package);
        } else {
            System.out.println("Package not found at this version.");
        }
    }

    public void downloadPackageAtVersion(int version) {
        DataPackage package = getPackageAtVersion(version);
        if (package != null) {
            System.out.println("Downloading package at version " + version + ": " + package);
        } else {
            System.out.println("Package not found at this version.");
        }
    }

    public void getSchemaChanges() {
        if (currentPackage != null) {
            System.out.println("Schema changes for current package: " + currentPackage.getSchemaChanges());
        } else {
            System.out.println("No current package to get schema changes for.");
        }
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public DataPackage getCurrentPackage() {
        return currentPackage;
    }

    public void setCurrentPackage(DataPackage currentPackage) {
        this.currentPackage = currentPackage;
    }

    public List<DataPackage> getPreviousPackages() {
        return previousPackages;
    }
}

class DataPackage {
    private String tag;
    private String schema;

    public DataPackage(String tag, String schema) {
        this.tag = tag;
        this.schema = schema;
    }

    public String getTag() {
        return tag;
    }

    public String getSchema() {
        return schema;
    }

    public String getSchemaChanges() {
        return "Schema changes: " + schema;
    }

    @Override
    public String toString() {
        return "DataPackage{" +
                "tag='" + tag + '\'' +
                ", schema='" + schema + '\'' +
                '}';
    }
}

