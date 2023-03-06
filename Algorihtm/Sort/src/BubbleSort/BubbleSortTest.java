package BubbleSort;

import java.util.ArrayList;

public class BubbleSortTest {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < 100; i ++) {
            arrayList.add((int) (Math.random() * 100));
        }

        BubbleSort bSort = new BubbleSort();

        System.out.println(bSort.sort(arrayList));

    }
}
