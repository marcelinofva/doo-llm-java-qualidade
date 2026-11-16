// File: Collection.java
```java
import java.util.List;

public class Collection {
    private List<Item> items;
    private String embargoPolicy;

    public void setEmbargoPolicy(String policy) {
        embargoPolicy = policy;
    }

    public String getEmbargoPolicy() {
        return embargoPolicy;
    }
}

