public class Main {
    public static void main(String[] args) {
        VirtualMachine vm = new VirtualMachine();
        SnapshotManager manager = new SnapshotManager();

        vm.setState("Состояние 1");
        manager.saveMemento(vm.saveStateToMemento());

        vm.setState("Состояние 2");
        manager.saveMemento(vm.saveStateToMemento());

        vm.setState("Состояние 3");

        vm.restoreStateFromMemento(manager.getMemento());
    }
}
