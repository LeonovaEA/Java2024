public class Main {
    public static void main(String[] args) {
        AutomationSystem plcSystem = new PLCSystem();
        AutomationControl basicControl = new BasicAutomationControl(plcSystem);
        basicControl.control("Начать производство");

        AutomationSystem scadaSystem = new SCADASystem();
        AutomationControl advancedControl = new AdvancedAutomationControl(scadaSystem);
        advancedControl.control("Датчики монитора");

        AutomationSystem robotSystem = new RobotSystem();
        AutomationControl basicControlRobot = new BasicAutomationControl(robotSystem);
        basicControlRobot.control("Двигать рукой");
    }
}