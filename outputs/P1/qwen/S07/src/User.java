// File: User.java
```java
import java.util.List;

public class User {
    private List<String> permissions;

    public boolean hasPermission(String permission) {
        return permissions.contains(permission);
    }

    public void grantPermission(String permission) {
        permissions.add(permission);
    }
}

