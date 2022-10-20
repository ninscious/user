package design.pattern.adapter;

/**
 * 适配器模式
 */
public class DemoMain {
    public static void main(String[] args) {
        NetToUsb netToUsb = new NetToUsbImpl();
        netToUsb.online();
    }
}
