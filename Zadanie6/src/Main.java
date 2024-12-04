public class Main {
    public static void main(String[] args) {
        Player human = new HumanPlayer();
        Player bot = new BotPlayer();
        Player npc = new NPCPlayer();

        System.out.println("Обновление Человека:");
        human.update();

        System.out.println("\nОбновление Бота:");
        bot.update();

        System.out.println("\nОбновление NPC:");
        npc.update();
    }
}
