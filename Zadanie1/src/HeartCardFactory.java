public class HeartCardFactory extends CardFactory {
    @Override
    public Card createCard(String rank) {
        return new HeartCard(rank);
    }
}