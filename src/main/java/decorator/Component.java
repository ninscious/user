package decorator;

public interface Component {

    public final String USER_PREFIX = "ttttt";


    default void speak() {
        System.out.println("i speak");
    }
}
