package interfaceex;

public class CompleteCalc extends Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int n1 = 10;
        int n2 = 2;

        System.out.println(calc.add(n1, n2));
        System.out.println(calc.substract(n1, n2));
        System.out.println(calc.times(n1, n2));
        System.out.println(calc.divide(n1, n2));

        calc.showInfo();
    }
}
