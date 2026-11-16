public class Affidavit {
    private boolean isSubmitted;
    private boolean isValid;

    public void submitAffidavit() {
        isSubmitted = true;
    }

    public void validateAffidavit() {
        isValid = true;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public boolean isValid() {
        return isValid;
    }
}
