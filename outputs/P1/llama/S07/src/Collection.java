// File: Collection.java

import java.util.ArrayList;
import java.util.Date;

public class Collection {
    private ArrayList<Item> items;
    private Date embargoDate;

    public Collection() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setEmbargoDate(Date embargoDate) {
        this.embargoDate = embargoDate;
    }

    public Date getEmbargoDate() {
        return embargoDate;
    }
}
