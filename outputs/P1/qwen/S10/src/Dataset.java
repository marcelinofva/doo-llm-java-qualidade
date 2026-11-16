public class Dataset {
    private String title;
    private boolean isPublic;
    private boolean isHidden;

    public Dataset(String title) {
        this.title = title;
        this.isPublic = false;
        this.isHidden = false;
    }

    public void edit() {
        // Implementation to edit dataset
    }

    public void delete() {
        // Implementation to delete dataset
    }

    public void hide() {
        this.isHidden = true;
        this.isPublic = false;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public boolean isHidden() {
        return isHidden;
    }
}
