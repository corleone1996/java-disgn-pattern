package observer;

/**
 * @author zhy
 */
public class ConcreteObserverB implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者B作出反应");
    }
}
