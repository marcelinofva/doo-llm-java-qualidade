import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, DataPackage> dataPackages;

    public Registry() {
        this.dataPackages = new HashMap<>();
    }

    public void publish(DataPackage dataPackage) {
        dataPackage.validate();
        dataPackage.publish();
        dataPackages.put(dataPackage.getId(), dataPackage);
    }

    public void unpublish(DataPackage dataPackage) {
        dataPackage.unpublish();
        dataPackages.put(dataPackage.getId(), dataPackage);
    }

    public void delete(DataPackage dataPackage) {
        dataPackage.delete();
        dataPackages.remove(dataPackage.getId());
    }

    public void restore(DataPackage dataPackage) {
        dataPackage.restore();
        dataPackages.put(dataPackage.getId(), dataPackage);
    }
}
