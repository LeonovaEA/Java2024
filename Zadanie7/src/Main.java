public class Main {
    public static void main(String[] args) {
        EmailBuilder emailBuilder = new ConcreteEmailBuilder();
        Director director = new Director(emailBuilder);

        Email email = director.constructEmail("sender@example.com", "recipient@example.com",
                "Испытуемый", "Это текст письма.");

        System.out.println(email);
    }
}
