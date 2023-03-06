package RecursiveCall;

public class RecursiveMultiply {
    public int recursiveMultiply(int n) {
        if (1 >= n) {
            return 1;
        }
        return n * recursiveMultiply(n - 1);
    }

    public static void main(String[] args) {
        RecursiveMultiply recursiveMultiply = new RecursiveMultiply();
        System.out.println(recursiveMultiply.recursiveMultiply(5));
    }
}
