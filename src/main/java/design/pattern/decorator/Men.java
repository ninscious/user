package design.pattern.decorator;

public class Men implements Person {
    @Override
    public void buyHouse() {
        System.out.println("men choose house");
        System.out.println("men buy house");
        System.out.println("men pay house money");
    }
}
