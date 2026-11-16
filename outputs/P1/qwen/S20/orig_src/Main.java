public class Main {
    public static void main(String[] args) {
        File file1 = new File();
        file1.setContent("Sensitive information");
        file1.markAsRestricted();
        file1.addRestriction(new IPAddressRestriction());

        File file2 = new File();
        file2.setContent("Non-sensitive information");
        file2.redactContent();

        Group group = new Group();
        group.addFile(file1);
        group.addFile(file2);
        group.markAsRestricted();
        group.addRestriction(new UserRestriction());

        group.uploadFiles();
    }
}
