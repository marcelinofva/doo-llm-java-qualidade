// File: Registry.java

import java.util.ArrayList;
import java.util.List;

public class Registry {
    private List<DataPackage> dataPackages;

    public Registry() {
        this.dataPackages = new ArrayList<>();
    }

    public void add(DataPackage dataPackage) {
        dataPackages.add(dataPackage);
    }

    public void remove(DataPackage dataPackage) {
        dataPackages.remove(dataPackage);
    }

    public void restore(DataPackage dataPackage) {
        dataPackages.add(dataPackage);
    }
}
