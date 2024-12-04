public class SpadeCardFactory extends CardFactory {
    @Override
    public Card createCard(String rank) {
        return new SpadeCard(rank);
    }
}