public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(1, 3));
        System.out.println(calc.substract(3, 2));
        System.out.println(calc.times(2, 3));
        System.out.println(calc.devide(10, 2));
    }
}
