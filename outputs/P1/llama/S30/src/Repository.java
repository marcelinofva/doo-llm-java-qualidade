// File: Repository.java

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private List<ETD> etds;

    public Repository() {
        etds = new ArrayList<>();
    }

    public void addETD(ETD etd) {
        etds.add(etd);
    }

    public ETD getETD(int index) {
        return etds.get(index);
    }

    public void removeETD(ETD etd) {
        etds.remove(etd);
    }
}
