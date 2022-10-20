package design.pattern.observer;

public class Observer2 implements IObserver {
    @Override
    public void inotify() {
        System.out.println("observer2 notify");
    }
}
