package design.pattern.observer;

public class ConcreteTarget extends Target {
    @Override
    public void change() {
        System.out.println("change concrete status");
        System.out.println("notify all observer...");
        this.inotify();
    }
}
