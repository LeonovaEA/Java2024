public class SpadeCard extends Card {
    public SpadeCard(String rank) {
        this.suit = "Пики";
        this.rank = rank;
    }

    @Override
    public void display() {
        System.out.println("Карта: " + rank + " " + suit);
    }
}