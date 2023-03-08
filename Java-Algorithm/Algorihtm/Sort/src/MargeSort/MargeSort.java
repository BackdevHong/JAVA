package MargeSort;

import java.util.ArrayList;

public class MargeSort {
    public ArrayList<Integer> margeSplitFunc(ArrayList<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }

        int medium = arr.size() / 2;

        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        leftArr = margeSplitFunc(new ArrayList<>(arr.subList(0, medium)));
        rightArr = margeSplitFunc(new ArrayList<>(arr.subList(medium, arr.size())));

        return margeFunc(leftArr, rightArr);
    }
}
