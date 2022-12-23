package functional_Interface;

public class MaxTest {
    public static void main(String[] args) {
        Max maxEl = (x, y) -> x > y ? x : y;

        System.out.println(maxEl.max(50, 10));
        System.out.println(maxEl.max(50, 20));
        System.out.println(maxEl.max(50, 100));
        System.out.println(maxEl.max(50, 50));
    }
}
