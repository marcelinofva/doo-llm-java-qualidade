// File: Repository.java

import java.util.ArrayList;
import java.util.Date;

public class Repository {
    private ArrayList<Embargo> embargoes;
    private ArrayList<User> administrators;

    public Repository() {
        embargoes = new ArrayList<>();
        administrators = new ArrayList<>();
    }

    public void liftEmbargoes() {
        for (Embargo embargo : embargoes) {
            embargo.liftEmbargo();
        }
    }

    public void setAccessControls() {
        // implementation omitted
    }

    public void viewEmbargoMetadata() {
        // implementation omitted
    }

    public void addAdministrator(User user) {
        administrators.add(user);
    }
}
