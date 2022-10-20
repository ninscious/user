package design.pattern.decorator;

public class Women implements Person {
    @Override
    public void buyHouse() {
        System.out.println("women choose house");
        System.out.println("women buy house");
        System.out.println("women pay house money");
    }
}
