package SelectionSort;

import BubbleSort.BubbleSort;

import java.util.ArrayList;

public class SelectionSortTest {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < 100; i ++) {
            arrayList.add((int) (Math.random() * 100));
        }

        SelectionSort sSort = new SelectionSort();

        System.out.println(sSort.sort(arrayList));

    }
}
