package MargeSort;

import java.util.ArrayList;

public class Split {
    public void splitFunc(ArrayList<Integer> arr) {
        if (arr.size() <= 1) {
            return;
        }
        int medium = arr.size() / 2;

        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        leftArr = new ArrayList<>(arr.subList(0, medium));
        rightArr = new ArrayList<>(arr.subList(medium, arr.size()));

        System.out.println(leftArr + "\n" + rightArr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        while (arr.size() < 50) {
            arr.add((int) (Math.random() * 10));
        }

        Split split = new Split();
        split.splitFunc(arr);
    }
}
