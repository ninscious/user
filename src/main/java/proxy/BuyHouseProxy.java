package proxy;

public class BuyHouseProxy implements BuyHouse {
    private BuyHouse buyHouse;
    public BuyHouseProxy(final BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("查询房源");
        System.out.println("买家卖家沟通");
        buyHouse.buyHouse();
        System.out.println("组织过户");
    }
}
