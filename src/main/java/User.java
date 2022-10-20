import lombok.Data;

@Data
public class User implements Cloneable {


    private long id;
    private String name;
    private byte age;
    private byte userType;

//    public User() {
//        this.id = 0L;
//        this.name = "";
//        this.age = 0;
//    }
//
//    public User(String name) {
//        this.name = name;
//    }
//
//    public User(byte userType) {
//        this.userType = userType;
//    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void say(String something) {
        System.out.println("say :" + something);
    }
}
