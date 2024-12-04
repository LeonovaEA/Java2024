public class AdvancedAutomationControl extends AutomationControl {
    public AdvancedAutomationControl(AutomationSystem system) {
        super(system);
    }

    @Override
    public void control(String command) {
        System.out.println("Расширенное управление запущено.");
        system.executeCommand(command);
    }
}