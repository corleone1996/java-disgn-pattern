package memento;

/**
 * 管理者
 *
 * @author zhy
 */
public class Caretaker {

    private Memento memento;

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
