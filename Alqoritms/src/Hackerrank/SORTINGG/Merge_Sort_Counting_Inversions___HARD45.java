package Hackerrank.SORTINGG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Merge_Sort_Counting_Inversions___HARD45 {

    public static void main(String[] args) {
//        int arr[] = {1, 1, 1, 2, 2};        //0
        int arr[] = {2, 1, 3, 1, 2};      //4

        System.out.println("result = " + countInversions(arr));
    }

    // Complete the countInversions function below.
    static long countInversions(int[] arr) {
        long counter = 0;
        int min = Integer.MAX_VALUE, minIndex = 0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);
        }
        System.out.println(list1);

        for (int k = 0; k < list1.size(); k++) {
            for (int i = index + 1; i < list1.size(); i++) {
                if (list1.get(i) < min) {
                    min = list1.get(i);
                    minIndex = i;
                }
            }

            list2.add(min);

        }

        System.out.println(list1);
        return counter;
    }

//    public int findMin()
}
