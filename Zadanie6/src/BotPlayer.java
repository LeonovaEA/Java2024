public class BotPlayer extends Player {
    @Override
    protected void performSpecialAction() {
        System.out.println("Бот атакует.");
    }

    @Override
    protected String getPlayerType() {
        return "Бот";
    }
}