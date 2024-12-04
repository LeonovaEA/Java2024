public class SnapshotManager {
    private Memento memento;
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
    public Memento getMemento() {
        return memento;
    }
}