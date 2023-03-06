package InsertionSort;

import java.util.ArrayList;
import java.util.Collections;

public class Range3SortTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(7);

        System.out.println(sort(arrayList));
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        for (int index = 0; index < dataList.size() - 1; index++) {
            for (int index2 = index + 1; index2 > 0; index2--) {
                if (dataList.get(index2) < dataList.get(index2 - 1)) {
                    Collections.swap(dataList, index2, index);
                }
            }
        }
        return dataList;
    }
}