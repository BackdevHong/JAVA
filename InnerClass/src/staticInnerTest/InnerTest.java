package staticInnerTest;

public class InnerTest {
    public static void main(String[] args) {
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

        System.out.println("");

        OutClass.InStaticClass.sTest();
    }
}
