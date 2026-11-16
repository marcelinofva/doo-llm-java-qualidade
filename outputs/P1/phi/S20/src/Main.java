// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Demonstration of main flows using hard-coded data
        File file1 = new File("file1.txt");
        file1.setRestricted(true);
        file1.setRestrictedUntil("2023-12-31");
        file1.setDetailedRestrictions("Can be shared with internal team only.");
        file1.setRestrictedByIP("192.168.1.1");
        file1.setRestrictedByUser("donor1");

        File file2 = new File("file2.txt");
        file2.setRestricted(true);
        file2.setRestrictedUntil("2024-01-15");
        file2.setDetailedRestrictions("Can be shared with researchers only.");
        file2.setRestrictedByIP("10.0.0.1");
        file2.setRestrictedByUser("researcher1");

        System.out.println(file1);
        System.out.println(file2);
    }
}

