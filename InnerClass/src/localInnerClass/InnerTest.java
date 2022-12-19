package localInnerClass;

public class InnerTest {
    public static void main(String[] args) {
        OutClass out = new OutClass();
        Runnable runner = out.getRunnable(100);

        runner.run();
    }
}
