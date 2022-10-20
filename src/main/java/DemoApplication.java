import com.google.gson.Gson;
import proxy.BuyHouse;
import proxy.BuyHouseImpl;
import proxy.BuyHouseProxy;
import proxy.BuyHouseProxyHandler;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

public class DemoApplication {



//    public static void swap(String x, String y) {
//        String tmp = y;
//        y = x;
//        x = tmp;
//        System.out.println("x " + x);
//        System.out.println("y " + y);
//    }


    public static void main(String[] args) {
        Object obj = null;

        Map<String, String> map = new Hashtable<>();
//        new HashMap<>()

        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String e = new String("abc");
        String d = "ab" + "c";
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(c == e);
        
//        byte[] allocation = null;
//        allocation = new byte[10240 * 1024];
//        User user = new User();

//        String a = "xszhang";
//        String b = "xszhang";
//        b = "xszhang1";
//        String c = new String("xszhang1");
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        System.out.println(c.hashCode());


//        Map<String, String> map = new ConcurrentHashMap<>();
//        try (InputStream is = new FileInputStream("/home/xszhang/tt.txt");
//             BufferedInputStream bi = new BufferedInputStream(is)) {
//            String s = new String(bi.readAllBytes());
//            System.out.println(s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Queue<Integer> queue = new Queue<Integer>()
        // 动态代理
//        BuyHouse proxy = (BuyHouse) Proxy.newProxyInstance(BuyHouseImpl.class.getClassLoader(), new Class[]{BuyHouse.class}, new BuyHouseProxyHandler(new BuyHouseImpl()));
//        proxy.buyHouse();
        // 静态代理
//        BuyHouse proxy = new BuyHouseProxy(new BuyHouseImpl());
//        proxy.buyHouse();

//        Class<User> userClass = User.class;
//        User user = new User();
//        Class<? extends User> aClass = user.getClass();
//        try {
//            Method say = userClass.getDeclaredMethod("say", String.class);
//            try {
//                say.invoke(user, "ddddd");
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            }
//
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }


//        String a = "x";
//        String b = "y";
////        swap(a, b);
//        System.out.println("a " + a);
//        System.out.println("b " + b);


////        System.out.println("11111");
//        System.out.println(111);
////        int t = User::getPrefix();
//
//        Integer integer = Integer.valueOf(222);
//
//        Integer integer2 = 10233;
//        int number = integer2.intValue();

//        BigInteger x = new BigInteger("398948333333333333333333333333333333333333333333333666");
//        System.out.println(x);
//        BigInteger multiply = x.multiply(BigInteger.valueOf(2L));
//        System.out.println(multiply);

//        User userA = new User();
//        User userB = userA;
//        System.out.println(userA.equals(userB));


        // 多
//        User customer = new User();
//        User customer1 = new User();

//        User manager = new Manager();
//        customer.setName("xszhang1");

//        System.out.println(new Gson().toJson(customer));
////        System.out.println(new Gson().toJson(manager));
//        Class<? extends User> aClass = customer.getClass();
//        ClassLoader classLoader = aClass.getClassLoader();
//        System.out.println(classLoader);
//        System.out.println(customer.hashCode());
//        System.out.println(customer1.hashCode());
//        System.out.println(customer == customer1);
//        System.out.println(customer.equals(customer1));

//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("dddddd").append("ttttt");
//
//        System.out.println(stringBuffer.toString());

//        String a = "xszhang";
//        String b = "xszhang";
//        String c = new String("xszhang");
//        String d = c.intern();
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(a == d);

//        Corse<User> corse = new Corse<>();
    }


}
