// File: Publisher.java

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<DataPackage> dataPackages;
    private Validator validator;

    public Publisher() {
        this.dataPackages = new ArrayList<>();
        this.validator = new Validator();
    }

    public void publish(DataPackage dataPackage) {
        validator.validate(dataPackage);
        dataPackages.add(dataPackage);
    }

    public void unpublish(DataPackage dataPackage) {
        dataPackages.remove(dataPackage);
    }

    public void validate(DataPackage dataPackage) {
        validator.validate(dataPackage);
    }
}
