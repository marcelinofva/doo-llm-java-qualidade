// File: Contact.java

public class Contact {
    private String name;
    private String phoneNumber;
    private String notes;

    public Contact(String name, String phoneNumber, String notes) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getNotes() {
        return notes;
    }
}
