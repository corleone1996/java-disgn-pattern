package observer;

/**
 * @author zhy
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();
        subject.addObserver(observerA);
        subject.addObserver(observerB);
        subject.notifyObserver();
    }
}
