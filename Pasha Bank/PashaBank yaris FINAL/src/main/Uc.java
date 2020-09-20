package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Uc {

    public static void main(String[] args) {

//        /////////////////CASE 1       ANSWER-10
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(2);
//        list.add(6);
//        int threeshold = 3;
//        /////////////////CASE 2       ANSWER-6
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);

        int threeshold = 2;
        System.out.println("result = " + calculateCost(list, threeshold));

    }

    public static int calculateCost(List<Integer> arr, int threshold) {

        int maxFlow = 1;

        List<Integer> sumList = new ArrayList<>();
        for (int i = 0; i < threshold; i++) {

            int miniSum = 0;

            for (int j = 0; j < arr.size(); j++) {
                int max = Integer.MIN_VALUE;

                if (i + j > threshold) {
//                    System.out.println("Boyuk oldu");
                    for (int k = j; k < arr.size(); k++) {
                        if (max < arr.get(k)) {
                            max = arr.get(k);
                        }
                    }
                    miniSum += max;
                    break;
                }

                for (int k = j; k < i + 1 + j; k++) {
                    if (max < arr.get(k)) {
                        max = arr.get(k);
                    }

                }
                int ferq = i + 1;
                if (ferq > 1) {
                    j += ferq - 1;
                }

                System.out.println("max = " + max);

                miniSum += max;
            }

            System.out.println(miniSum);
//            System.out.println("\n\n");
//            maxFlow++;

            sumList.add(miniSum);
        }
        return Collections.min(sumList);
    }
}
