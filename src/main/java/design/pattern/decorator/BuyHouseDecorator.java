package design.pattern.decorator;

public class BuyHouseDecorator implements Person {

    private final Person person;

    public BuyHouseDecorator(Person person) {
        this.person = person;
    }

    @Override
    public void buyHouse() {
        person.buyHouse();
    }

    public void sendEmail() {

    }
}
