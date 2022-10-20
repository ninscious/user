package design.pattern.adapter;

public class NetToUsbImpl extends Net implements NetToUsb {
    @Override
    public void online() {
        System.out.println("这是usb接口,正在适配网络接口上网");
        super.online();
    }
}
