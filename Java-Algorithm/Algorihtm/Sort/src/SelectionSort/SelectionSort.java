package SelectionSort;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        for (int stand = 0; stand < dataList.size() -1; stand++) {
            int lowest = stand;

            for (int idx = stand + 1; idx < dataList.size(); idx++) {
                if (dataList.get(lowest) > dataList.get(idx)) {
                    lowest = idx;
                }
            }

            Collections.swap(dataList, lowest, stand);
        }
        return dataList;
    }
}
