// File: Main.java

public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Group group = new Group("group1");
        group.addFile(file1);
        group.addFile(file2);

        FileRestriction restriction = new FileRestriction("access", new Date());
        group.addRestriction(restriction);

        User user = new User("user1");
        user.addAccess(file1);

        IPAccess ipAccess = new IPAccess("192.168.1.1");
        ipAccess.addAccess(file2);

        System.out.println("Files in group: " + group.getFiles());
        System.out.println("Restrictions for group: " + group.getRestrictions());
        System.out.println("Files accessible by user: " + user.getFiles());
        System.out.println("Files accessible by IP: " + ipAccess.getFiles());
    }
}
