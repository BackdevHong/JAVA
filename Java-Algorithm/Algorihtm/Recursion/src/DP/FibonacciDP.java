package DP;

public class FibonacciDP {
    public int DynamicFunc(int n) {
        Integer[] cache = new Integer[n + 1];
        cache[0] = 0;
        cache[1] = 1;

        for(int idx = 2; idx < n + 1; idx++) {
            cache[idx] = cache[idx - 1] + cache[idx - 2];
        }
        return cache[n];
    }

    public static void main(String[] args) {
        FibonacciDP fibonacciDP = new FibonacciDP();

        System.out.println(fibonacciDP.DynamicFunc(10));
    }
}
