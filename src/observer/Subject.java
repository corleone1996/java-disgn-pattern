package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标
 *
 * @author zhy
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver();
}
