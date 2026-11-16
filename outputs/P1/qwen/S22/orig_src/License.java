public class License {
    private String type;
    private String details;

    public License(String type, String details) {
        this.type = type;
        this.details = details;
    }

    public void applyLicense(Dataset dataset) {
        dataset.applyLicense(this);
    }
}
