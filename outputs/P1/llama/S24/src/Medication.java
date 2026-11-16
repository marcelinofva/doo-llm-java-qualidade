// File: Medication.java

public class Medication {
    private String name;
    private Emergency emergency;

    public Medication(String name) {
        this.name = name;
        this.emergency = new Emergency();
    }

    public Emergency getEmergency() {
        return this.emergency;
    }

    public void setEmergency(Emergency emergency) {
        this.emergency = emergency;
    }
}
