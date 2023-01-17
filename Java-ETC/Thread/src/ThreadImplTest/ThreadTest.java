package ThreadImplTest;

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread() + "start");
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();

        th1.start();
        th2.start();
        System.out.println(Thread.currentThread() + "end");
    }
}
