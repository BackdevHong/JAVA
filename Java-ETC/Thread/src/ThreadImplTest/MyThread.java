package ThreadImplTest;

public class MyThread extends Thread{
    public void run() {
        int i;
        for (i = 1; i <= 200; i++) {
            System.out.println(i + "\t");
        }
    }
}
