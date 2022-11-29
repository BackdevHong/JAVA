package threeDPrinter.noGeneric;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        ThreeDPrinter3 test = new ThreeDPrinter3();

        Powder powder = new Powder();

        test.setMaterial(powder);
        // 여기까지만 해도 문제는 없었음

        // Powder p = test.getMaterial();
        // 여기에서 문제 발생.

        Powder p2 = (Powder) test.getMaterial();
        // 이렇게 해야 문제가 생기지 않음.
    }
}
