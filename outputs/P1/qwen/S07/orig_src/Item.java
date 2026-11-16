public class Item {
    private String metadata;
    private Embargo embargo;

    public void liftEmbargo() {
        if (embargo != null) {
            embargo = null;
        }
    }

    public void setEmbargoDate(Date startDate, Date endDate) {
        embargo = new Embargo(startDate, endDate);
    }

    public String getEmbargoStatus() {
        if (embargo == null) {
            return "No embargo";
        } else {
            return "Embargoed until " + embargo.getEndDate();
        }
    }
}

