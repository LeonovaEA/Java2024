public class DiamondCardFactory extends CardFactory {
    @Override
    public Card createCard(String rank) {
        return new DiamondCard(rank);
    }
}