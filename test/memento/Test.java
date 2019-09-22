package memento;

/**
 * @author zhy
 */
public class Test {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("S0");
        System.out.println("初始状态：" + originator.getState());

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());// 保存状态

        originator.setState("S1");
        System.out.println("新的状态：" + originator.getState());
        originator.restoreMemento(caretaker.getMemento());// 恢复状态
        System.out.println("恢复状态：" + originator.getState());
    }
}
