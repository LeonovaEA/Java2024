public class DiamondCard extends Card {
    public DiamondCard(String rank) {
        this.suit = "Бубны";
        this.rank = rank;
    }

    @Override
    public void display() {
        System.out.println("Карта: " + rank + " " + suit);
    }
}