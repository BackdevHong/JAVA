package anonumousInnerClass;

public class OutClass {
    int outNum = 100;
    static int sNum = 200;
    Runnable getRunnable(int i) {
        int num = 10;
        return new Runnable() {
            int localNum = 1000;

            @Override
            public void run() {
                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum);
                System.out.println("OutClass.sNum = " + OutClass.sNum);
            }
        };
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable class");
        }
    };
}
