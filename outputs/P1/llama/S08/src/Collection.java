// File: Collection.java

import java.util.ArrayList;
import java.util.List;

public class Collection {
    private String name;
    private List<DepositGroup> depositGroups;
    private List<Item> items;

    public Collection(String name) {
        this.name = name;
        this.depositGroups = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public void addDepositGroup(DepositGroup depositGroup) {
        this.depositGroups.add(depositGroup);
    }

    public void removeDepositGroup(DepositGroup depositGroup) {
        this.depositGroups.remove(depositGroup);
    }

    public List<DepositGroup> getDepositGroups() {
        return this.depositGroups;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public List<Item> getItems() {
        return this.items;
    }
}
