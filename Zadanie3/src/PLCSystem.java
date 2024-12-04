public class PLCSystem implements AutomationSystem {
    @Override
    public void executeCommand(String command) {
        System.out.println("Выполнение команды на PLC: " + command);
    }
}