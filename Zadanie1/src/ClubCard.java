public class ClubCard extends Card {
    public ClubCard(String rank) {
        this.suit = "Крести";
        this.rank = rank;
    }

    @Override
    public void display() {
        System.out.println("Карта: " + rank + " " + suit);
    }
}