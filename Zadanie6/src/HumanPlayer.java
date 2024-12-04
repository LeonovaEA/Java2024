public class HumanPlayer extends Player {
    @Override
    protected void performSpecialAction() {
        System.out.println("Человек общается.");
    }

    @Override
    protected String getPlayerType() {
        return "Человек";
    }
}