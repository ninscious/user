import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Customer extends User {
//
//    public Customer(String brand) {
//        super((byte) 3);
//        this.brand = brand;
//    }

    private String brand;
}
