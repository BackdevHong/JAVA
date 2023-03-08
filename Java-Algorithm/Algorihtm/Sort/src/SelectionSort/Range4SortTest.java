package SelectionSort;

import java.util.ArrayList;
import java.util.Collections;

public class Range4SortTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(9);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);

        System.out.println(sort(arrayList));
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        for (int idx = 0; idx < dataList.size(); idx++) {
            int min = 0;

            for (int idx2 = 0; idx2 < dataList.size() -1 -idx; idx2++) {
                if (dataList.get(idx2) > dataList.get(idx2+1)) {
                    min = idx2;
                }
            }

            Collections.swap(dataList, idx, min);
        }
        return dataList;
    }
}
