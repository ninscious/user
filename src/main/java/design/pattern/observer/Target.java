package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public abstract class Target {
    private List<IObserver> observers = new Vector<>();

    public void add(IObserver observer) {
        if (null == observers) {
            observers = new ArrayList<>();
        }
        this.observers.add(observer);
    }

    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }

    public void inotify() {
        observers.forEach(IObserver::inotify);
    }

    public abstract void change();
}
