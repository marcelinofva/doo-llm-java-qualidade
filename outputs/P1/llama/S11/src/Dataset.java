// File: Dataset.java

import java.util.ArrayList;
import java.util.List;

public class Dataset {
    private List<DataModel> dataModels;

    public Dataset() {
        this.dataModels = new ArrayList<>();
    }

    public void addDataModel(DataModel dataModel) {
        this.dataModels.add(dataModel);
    }

    public List<DataModel> getDataset() {
        return dataModels;
    }

    public void updateDataset(List<DataModel> newDataset) {
        this.dataModels = newDataset;
    }
}
