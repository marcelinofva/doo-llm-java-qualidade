// File: Main.java

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("metadata");
        Embargo embargo = new Embargo(item, new Date());
        item.setEmbargo(embargo);

        Collection collection = new Collection();
        collection.addItem(item);

        Repository repository = new Repository();
        repository.addAdministrator(new User("admin"));

        repository.liftEmbargoes();
        repository.viewEmbargoMetadata();
    }
}
