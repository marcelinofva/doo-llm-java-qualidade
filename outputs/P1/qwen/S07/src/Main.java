// File: Main.java
```java
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Item item = new Item();
        item.setEmbargoDate(new Date(), new Date(System.currentTimeMillis() + 30 * 24 * 60 * 60 * 1000)); // 30 days
        System.out.println(item.getEmbargoStatus());

        item.liftEmbargo();
        System.out.println(item.getEmbargoStatus());
    }
}
