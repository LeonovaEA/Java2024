public class RobotSystem implements AutomationSystem {
    @Override
    public void executeCommand(String command) {
        System.out.println("Выполнение команды на Роботе: " + command);
    }
}