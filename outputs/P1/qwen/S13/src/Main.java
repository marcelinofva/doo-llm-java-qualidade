public class Main {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.setName("John Doe");
        trainer.setEmail("john.doe@example.com");
        trainer.setDetails("Certified Scrum Trainer");
        trainer.setEmailPrivate(true);

        Class class1 = new Class();
        class1.setTitle("Scrum Master Fundamentals");
        class1.setLink("https://example.com/scrum-master-fundamentals");

        trainer.addClass(class1);

        System.out.println("Trainer Name: " + trainer.getName());
        System.out.println("Trainer Details: " + trainer.getDetails());
        System.out.println("Upcoming Class: " + trainer.getUpcomingClasses().get(0).getTitle());
    }
}
