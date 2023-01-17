package ThreadImplTest;

public class ThreadRunnableTest {
    public static void main(String[] args) {
        MyThreadRunnable runnable = new MyThreadRunnable();

        System.out.println(Thread.currentThread() + "start");
        Thread th3 = new Thread(runnable);
        th3.start();
        System.out.println(Thread.currentThread() + "end");
    }
}
