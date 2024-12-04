import java.util.Random;

public class RandomPersonGenerator {
    private static final String[] NAMES = {"John", "Alice", "Bob", "Emma", "Daniel"};
    private static final String[] DOMAINS = {"gmail.com", "yahoo.com", "outlook.com"};
    private Random random = new Random();
    public Person generateRandomPerson() {
        String name = NAMES[random.nextInt(NAMES.length)];
        int age = random.nextInt(100) + 18; // Возраст от 18 до 118
        String email = name.toLowerCase() + "@"
                + DOMAINS[random.nextInt(DOMAINS.length)];
        return new Person(name, age, email);
    }
    public Person generateClonedPerson(Person original) {
        Person clone = (Person) original.clone();
        clone.age = random.nextInt(100) + 18;
        clone.email = clone.getName().toLowerCase() + "@"
                + DOMAINS[random.nextInt(DOMAINS.length)];
        return clone;
    }
}