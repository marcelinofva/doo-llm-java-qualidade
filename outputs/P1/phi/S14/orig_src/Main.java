// File: Main.java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            List<NewsItem> newsItems = Arrays.asList(
                new NewsItem("Title1", "Content1", sdf.parse("2023-01-01"), sdf.parse("2022-12-01"), sdf.parse("2023-01-31"), 1),
                new NewsItem("Title2", "Content2", sdf.parse("2023-02-01"), sdf.parse("2022-12-01"), sdf.parse("2023-02-28"), 2)
            );
            for (NewsItem item : newsItems) {
                System.out.println("Title: " + item.getTitle());
                System.out.println("Content: " + item.getContent());
                System.out.println("Start Publishing Date: " + item.getStartPublishingDate());
                System.out.println("Old News Date: " + item.getOldNewsDate());
                System.out.println("Stop Publishing Date: " + item.getStopPublishingDate());
                System.out.println("Priority: " + item.getPriority());
                System.out.println("--------------------");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
