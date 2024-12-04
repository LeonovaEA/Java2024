public abstract class Player {
    public void update() {
        move();
        interact();
        performSpecialAction();
    }
    protected void move() {
        System.out.println(getPlayerType() + " движется.");
    }
    protected void interact() {
        System.out.println(getPlayerType() + " взаимодействует.");
    }
    protected abstract void performSpecialAction();
    protected abstract String getPlayerType();
}