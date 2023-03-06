package BubbleSort;

import org.w3c.dom.CDATASection;

import java.util.ArrayList;
import java.util.Collections;

public class Range3SortTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(4);

        for (int idx = 0; idx < arrayList.size() - 1; idx++) {
            if (arrayList.get(idx) > arrayList.get(idx + 1)) {
                Collections.swap(arrayList, idx, idx + 1);
            }
        }

        System.out.println(arrayList);
    }
}
