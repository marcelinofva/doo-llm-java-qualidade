import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, DataPackage> dataPackages;

    public Registry() {
        this.dataPackages = new HashMap<>();
    }

    public void addDataPackage(DataPackage dataPackage) {
        dataPackages.put(dataPackage.getId(), dataPackage);
    }

    public DataPackage getDataPackage(String id) {
        return dataPackages.get(id);
    }

    public Tag getTag(String tagId) {
        for (DataPackage dp : dataPackages.values()) {
            for (Tag tag : dp.getAllTags()) {
                if (tag.getTagId().equals(tagId)) {
                    return tag;
                }
            }
        }
        return null;
    }
}
