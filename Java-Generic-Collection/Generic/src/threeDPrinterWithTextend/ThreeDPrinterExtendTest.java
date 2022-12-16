package threeDPrinterWithTextend;

public class ThreeDPrinterExtendTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> GP = new GenericPrinter<>();

        Powder pw = new Powder();

        GP.setMaterial(pw);

        System.out.println(GP.toString());
    }
}
