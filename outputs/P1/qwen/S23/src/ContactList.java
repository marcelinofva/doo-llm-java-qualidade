import java.util.HashMap;
import java.util.Map;

public class ContactList {
    private Map<String, String> contacts;

    public ContactList() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public Map<String, String> getContacts() {
        return contacts;
    }
}
