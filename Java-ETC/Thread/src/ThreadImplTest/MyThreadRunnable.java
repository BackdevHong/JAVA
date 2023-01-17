package ThreadImplTest;

public class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        int i;
        for (i=1; i < 50; i++) {
            System.out.println(i + "\t");
        }
    }
}
