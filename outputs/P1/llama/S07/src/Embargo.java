// File: Embargo.java

public class Embargo {
    private Item item;
    private Date embargoDate;

    public Embargo(Item item, Date embargoDate) {
        this.item = item;
        this.embargoDate = embargoDate;
    }

    public void liftEmbargo() {
        item.setEmbargo(null);
    }

    public Date getEmbargoDate() {
        return embargoDate;
    }
}
