// File: MedicalCaregiver.java

public class MedicalCaregiver {
    private String name;
    private List<OlderPerson> olderPersons;

    public MedicalCaregiver(String name) {
        this.name = name;
        this.olderPersons = new ArrayList<>();
    }

    public void addOlderPerson(OlderPerson olderPerson) {
        this.olderPersons.add(olderPerson);
    }

    public List<OlderPerson> getOlderPersons() {
        return this.olderPersons;
    }

    public void getVideoCall() {
        // establish video call with older person
    }
}
