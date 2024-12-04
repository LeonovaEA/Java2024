public class ClubCardFactory extends CardFactory {
    @Override
    public Card createCard(String rank) {
        return new ClubCard(rank);
    }
}