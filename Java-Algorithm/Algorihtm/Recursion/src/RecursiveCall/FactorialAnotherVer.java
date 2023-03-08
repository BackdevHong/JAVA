package RecursiveCall;

public class FactorialAnotherVer {
    public int factorialFunc(int n) {
        if ( n < 1 ) {
            return 1;
        }
        return n * factorialFunc(n - 1);
    }

    public static void main(String[] args) {
        FactorialAnotherVer factorialAnotherVer = new FactorialAnotherVer();
        int fact = factorialAnotherVer.factorialFunc(5);
        System.out.println("fact = " + fact);
    }
}
