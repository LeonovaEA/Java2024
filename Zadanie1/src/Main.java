public class Main {
    public static void main(String[] args) {
        System.out.println("Случайно сгенерированные карты:");
        for (int i = 0; i < 5; i++) {
            Card card = CardGenerator.generateRandomCard();
            card.display();
        }
    }
}
