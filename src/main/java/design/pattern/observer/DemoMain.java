package design.pattern.observer;

/**
 * 观察者模式
 * 订阅-发布模式
 */
public class DemoMain {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.add(new Observer1());
        target.add(new Observer2());
        target.change();
    }
}
