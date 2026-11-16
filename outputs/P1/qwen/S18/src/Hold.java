public class Hold {
    private boolean isHeld;

    public void applyHold() {
        isHeld = true;
    }

    public void removeHold() {
        isHeld = false;
    }

    public boolean isHeld() {
        return isHeld;
    }
}
