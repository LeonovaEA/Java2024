public class VirtualMachine {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Состояние виртуальной машины установлено на:" + state);
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void restoreStateFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("Состояние виртуальной машины восстановлено до:" + state);
    }
}