package BubbleSort;

import java.util.ArrayList;
import java.util.Collections;

public class Range2SortTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(1);

        if (arrayList.get(0) > arrayList.get(1)) {
            Collections.swap(arrayList, 0, 1);
        }

        System.out.println(arrayList);
    }
}
