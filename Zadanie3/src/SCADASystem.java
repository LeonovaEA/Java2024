public class SCADASystem implements AutomationSystem {
    @Override
    public void executeCommand(String command) {
        System.out.println("Выполнение команды на SCADA: " + command);
    }
}