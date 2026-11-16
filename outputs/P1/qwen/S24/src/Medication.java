public class Medication {
    private String name;
    private int dosage;
    private boolean taken;

    public Medication(String name, int dosage) {
        this.name = name;
        this.dosage = dosage;
        this.taken = false;
    }

    public void intake() {
        taken = true;
    }

    public boolean isTaken() {
        return taken;
    }
}
