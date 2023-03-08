package SelectionSort;

import java.util.ArrayList;
import java.util.Collections;

public class Range2SortTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            arrayList.add((int)(Math.random()*5));
        }

        System.out.println(sort(arrayList));
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        if (dataList.get(0) > dataList.get(1)) {
            Collections.swap(dataList, 0, 1);
        }
        return dataList;
    }
}
