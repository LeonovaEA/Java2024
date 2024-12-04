public class BasicAutomationControl extends AutomationControl {
    public BasicAutomationControl(AutomationSystem system) {
        super(system);
    }

    @Override
    public void control(String command) {
        System.out.println("Базовый контроль запущен.");
        system.executeCommand(command);
    }
}