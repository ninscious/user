package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BuyHouseProxyHandler implements InvocationHandler {
    private Object object;

    public BuyHouseProxyHandler(final Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房查询");
        Object result = method.invoke(object, args);
        System.out.println("双方交易");
        return result;
    }
}
