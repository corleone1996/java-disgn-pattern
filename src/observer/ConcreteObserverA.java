package observer;

/**
 * @author zhy
 */
public class ConcreteObserverA implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者A做出反应");
    }
}
