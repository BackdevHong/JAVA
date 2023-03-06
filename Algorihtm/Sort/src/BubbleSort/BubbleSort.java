package BubbleSort;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        for (int idx = 0; idx < dataList.size() - 1; idx++) {
            boolean changed = false;

            for (int j = 0; j < dataList.size() -1 -idx; j++) {
                if (dataList.get(j) > dataList.get(j+1)) {
                    Collections.swap(dataList, j, j+1);
                    changed = true;
                }
            }

            if (!changed) {
                break;
            }
        }

        return dataList;
    }
}
