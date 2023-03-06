package InsertionSort;

import java.util.ArrayList;

public class InsertionSortTest {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < 100; i ++) {
            arrayList.add((int) (Math.random() * 100));
        }

        InsertionSort iSort = new InsertionSort();

        System.out.println(iSort.sort(arrayList));
    }
}
