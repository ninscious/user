package design.pattern.observer;

public class Observer1 implements IObserver {
    @Override
    public void inotify() {
        System.out.println("observer1 notify");
    }
}
