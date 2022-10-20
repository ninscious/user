package concurrent;

public class ConcurrentDemo {

    private static Object obj1 = new Object();
    private static Object obj2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (obj1) {
                System.out.println("get synchronized obj1, running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("waiting get obj2");
                try {
                    obj1.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj2) {
                    System.out.println("get obj2, running");
                }
            }
        },"线程1").start();

        new Thread(() -> {
            synchronized (obj2) {
                System.out.println("get synchronized obj2, running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("waiting get obj1");
                synchronized (obj1) {
                    System.out.println("get obj1, running");
                }
            }
        },"线程2").start();

        new Thread(() -> {
            System.out.println("11111");
        }).run();
    }
}
