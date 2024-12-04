import java.util.Random;

public class CardGenerator {
    private static final String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"
    };
    private static final CardFactory[] FACTORIES = {
            new HeartCardFactory(),
            new DiamondCardFactory(),
            new ClubCardFactory(),
            new SpadeCardFactory()
    };
    public static Card generateRandomCard() {
        Random random = new Random();
        String randomRank = RANKS[random.nextInt(RANKS.length)]; // Случайное достоинство
        CardFactory randomFactory = FACTORIES[random.nextInt(FACTORIES.length)]; // Случайная фабрика
        return randomFactory.createCard(randomRank); // Создание карты
    }
}