public class NPCPlayer extends Player {
    @Override
    protected void performSpecialAction() {
        System.out.println("NPC дает квест.");
    }

    @Override
    protected String getPlayerType() {
        return "NPC";
    }
}