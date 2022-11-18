public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(1, 3));
        System.out.println(calc.subtract(3, 2));
        System.out.println(calc.times(2, 3));
        System.out.println(calc.divide(10, 2));

        calc.description();

        int[] arr = {3, 5, 4, 2, 56, 23};
        System.out.println(Calc.total(arr));

    }
}
