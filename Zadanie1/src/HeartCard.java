public class HeartCard extends Card {
    public HeartCard(String rank) {
        this.suit = "Черви";
        this.rank = rank;
    }

    @Override
    public void display() {
        System.out.println("Карта: " + rank + " " + suit);
    }
}