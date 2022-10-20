package design.pattern.decorator;

public class DemoMain {
    public static void main(String[] args) {
        Person person = new Women();
        Person decorator = new BuyHouseDecorator(new Men());
        decorator.buyHouse();
    }
}
