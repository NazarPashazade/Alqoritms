package Hackerrank.ALGORITMS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds____EASY {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);

        System.out.println(migratoryBirds(arr));
    }

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {

        Integer maxCount = 0;
        Integer minNumber = arr.size();
        Integer counter = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {

            counter = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    counter++;
                }
            }
            list.add(counter);
        }

        maxCount = Collections.max(list);

        for (int i = 0; i < list.size(); i++) {

            if (maxCount == list.get(i)) {
                if (minNumber > arr.get(i)) {
                    minNumber = arr.get(i);
                }
                if (minNumber == 1) {
                    break;
                }
            }
        }

        return minNumber;
    }

}
