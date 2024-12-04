public abstract class AutomationControl {
    protected AutomationSystem system;

    public AutomationControl(AutomationSystem system) {
        this.system = system;
    }

    public abstract void control(String command);
}