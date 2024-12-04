public class Main {
    public static void main(String[] args) {
        RandomPersonGenerator generator = new RandomPersonGenerator();
        Person originalPerson = generator.generateRandomPerson();
        System.out.println("Оригинальная персона: " + originalPerson);
        Person clonedPerson = generator.generateClonedPerson(originalPerson);
        System.out.println("Клонированная персона: " + clonedPerson);
    }
}