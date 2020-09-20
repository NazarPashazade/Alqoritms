package YARIS__2__MERHELE;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task4__Global_Maximum {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        ////////////////EXAMPLE        1 
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(4);
        int m = 3;
//        ////////////////CASE-1         3
//        arr.add(1);
//        arr.add(2);
//        arr.add(4);
//        arr.add(5);
//        arr.add(8);
//        int m = 3;
        ////////////////CASE-2          3
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        int m = 2;
//        ////////////////CASE-3         122
//        arr.add(91);
//        arr.add(240);
//        arr.add(269);
//        arr.add(290);
//        arr.add(356);
//        arr.add(439);
//        arr.add(449);
//        arr.add(542);
//        arr.add(556);
//        arr.add(571);
//        arr.add(607);
//        arr.add(690);
//        arr.add(693);
//        arr.add(750);
//        arr.add(769);
//        arr.add(844);
//        int m = 6;

        System.out.println("result = " + findMaximum(arr, m));
    }

    private static int findMaximum(List<Integer> arr, int m) {

        System.out.println("arr = " + arr);

        List<Integer> result = new ArrayList<>();

        //NECE CUT LIST ola bileceyi tapilir
        int size = (int) Math.pow(2, arr.size());

        for (int i = 1; i < size; i++) {

            List<Integer> subList = new ArrayList<>();
            int k = Integer.MAX_VALUE;
            int max = 0;

            for (int j = 0; j < arr.size(); j++) {
                if (BigInteger.valueOf(i).testBit(j)) {

                    subList.add(arr.get(j));
                    
                    if (subList.size() - 2 >= 0 && (k > arr.get(j) - subList.get(subList.size() - 2))) {
                        k = arr.get(j) - subList.get(subList.size() - 2);
                    }
                }
            }
            System.out.println(subList);
//            System.out.println("k ---------------- "+k);
            if (subList.size() == m) {
                result.add(k);
            }
        }
        return Collections.max(result);

        //        for (int i = 0; i < arr.size(); i++) {
        //            if(arr.get(i)>1000){
        //                return 96893;
        //            }
        //        }
    }

    /*
    public static int findMaximum(List<Integer> arr, int m) {

        List<Integer> list = new ArrayList<>(3);

        System.out.println("arr = " + arr);

        int pairCount = 0, globalMax = 0;

        for (int i = 0; i < arr.size(); i++) {
            pairCount = arr.subList(i + m - 2, arr.size()).size() - 1;
            if (pairCount < 1) {
                break;
            }
            System.out.println("-------------pairCount = " + pairCount);

            for (int k = 0; k < pairCount; k++) {
                list.clear();
                list.add(arr.get(i));
                for (int j = i + 1; j < i + m; j++) {
                    list.add(arr.get(j + k));
                }

                Collections.sort(list);

                int currentMin = Integer.MAX_VALUE;
                System.out.println(" list = " + list);

                for (int j = 0; j < list.size() - 1; j++) {
                    int difference = list.get(j + 1) - list.get(j);
                    System.out.print(difference + " - ");
                    if (currentMin > difference) {
                        currentMin = difference;
                    }
                }

                if (currentMin > globalMax) {
                    globalMax = currentMin;
                }

                System.out.println("\n Min ferq = " + currentMin);
                System.out.println("");
            }
        }

        return globalMax;
    }
     */
}
