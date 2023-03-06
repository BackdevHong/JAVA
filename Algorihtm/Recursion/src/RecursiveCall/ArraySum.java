package RecursiveCall;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySum {
    public int arraySum(ArrayList<Integer> list) {
        if (list.size() <= 0) {
            return 0;
        }
        return list.get(0) + arraySum(new ArrayList<>(list.subList(1, list.size())));
    }

    public static void main(String[] args) {
        ArraySum arraySum = new ArraySum();

        ArrayList<Integer> testcase = new ArrayList<>();
        while (testcase.size() < 5) {
            testcase.add((int) (Math.random() * 10));
        }

        int i = arraySum.arraySum(testcase);
        System.out.println(testcase + " " + i);
    }
}
