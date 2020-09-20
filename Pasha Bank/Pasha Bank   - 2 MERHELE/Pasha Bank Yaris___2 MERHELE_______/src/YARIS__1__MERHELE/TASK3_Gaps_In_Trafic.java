package YARIS__1__MERHELE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TASK3_Gaps_In_Trafic {

    public static void main(String[] args) {

//        List<Integer> start = new ArrayList<>();
//        start.add(3);
//        start.add(8);
//
//        List<Integer> finish = new ArrayList<>();
//        finish.add(4);
//        finish.add(9);
//
//        int n = 10;
        List<Integer> start = new ArrayList<>();
        start.add(1);
        start.add(2);
        start.add(5);
        start.add(8);

        List<Integer> finish = new ArrayList<>();
        finish.add(2);
        finish.add(2);
        finish.add(6);
        finish.add(9);

        int n = 10;
        System.out.println("result = " + widestGap(n, start, finish));

    }
    
//    public static int widestGap1(int n, List<Integer> start, List<Integer> finish) {
//        
//        
////        ---------------------------------Part-1 -------------------------------
//
//        List<Integer> list = new ArrayList<>();
//        List<Integer> results = new ArrayList<>();
//        List<Integer> indexs = new ArrayList<>();
//
    
    
//        for (int i = 0; i < n; i++) {
//            list.add(0);
//        }
//
//        for (int i = 0; i < start.size(); i++) {
//            for (int j = start.get(i) - 1; j <= finish.get(i) - 1; j++) {
//                list.set(j, 1);
//            }
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) == 0) {
//                indexs.add(i);
//            }
//        }
////        ---------------------------------Part-2 -------------------------------
//
//        int counter = 1;
//        Set<Integer> set = new TreeSet<>();
//
//        for (int i = 0; i < indexs.size() - 2; i++) {
//            if (indexs.get(i) + 1 == indexs.get(i + 1)) {
//                counter++;
//                if (counter > 1) {
//                    set.add(counter);
//                }
//            } else {
//                counter = 1;
//            }
//        }
//       
//        return Collections.max(set);
//    }
//
//}

//    public static int widestGap2(int n, List<Integer> start, List<Integer> finish) {
//
//        //        ---------------------------------Part-1 -------------------------------
//        List<Integer> arr = new ArrayList<>();
//        Set<Integer> set = new TreeSet<>();
//        int counter = 0;
//
//        for (int i = 0; i < n; i++) {
//            arr.add(0);
//        }
//
//        for (int i = 0; i < start.size(); i++) {
//            for (int j = start.get(i) - 1; j <= finish.get(i) - 1; j++) {
//                arr.set(j, 1);
//
//            }
//        }
//        //        ---------------------------------Part-2 -------------------------------
//
//        for (int i = 0; i < n; i++) {
//            if (arr.get(i) == 0) {
//                counter++;
//            } else {
//                if (counter > 0) {
//                    set.add(counter);
//                }
//                counter = 0;
//            }
//        }
//        if (counter > 0) {
//            set.add(counter);
//        }
//        System.out.println(start);
//        System.out.println(finish);
//        System.out.println(arr);
//        System.out.println(set);
//        return Collections.max(set);
//    }
//
////
////
////
////
////
////
////
//    public static int widestGap3(int n, List<Integer> start, List<Integer> finish) {
//
//        List<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            arr.add(0);
//        }
//
//        for (int i = 0; i < start.size(); i++) {
//            for (int j = start.get(i) - 1; j <= finish.get(i) - 1; j++) {
//                arr.set(j, 1);
//            }
//        }
//        int counter = 0;
//
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            if (arr.get(i) == 0) {
//                counter++;
//            } else {
//                if (counter > 0) {
//                    list.add(counter);
//                }
//                counter = 0;
//            }
//
//        }
//        if (counter > 0) {
//            list.add(counter);
//        }
//
//        System.out.println(arr);
//        System.out.println(list);
//        return Collections.max(list);
//    }

//
//
//
//
    public static int widestGap(int n, List<Integer> start, List<Integer> finish) {

        //        ---------------------------------Part-1 -------------------------------
        Set<Integer> set = new TreeSet<>();
        int counter = 0;
        int massiv[] = new int[n];

        for (int i = 0; i < start.size(); i++) {
            for (int j = start.get(i) - 1; j <= finish.get(i) - 1; j++) {
                massiv[j] = 1;

            }
        }
        //        ---------------------------------Part-2 -------------------------------

        for (int i = 0; i < n; i++) {
            if (massiv[i] == 0) {
                counter++;
            } else {
                if (counter > 0) {
                    set.add(counter);
                }
                counter = 0;
            }
        }
        if (counter > 0) {
            set.add(counter);
        }

        return Collections.max(set);
    }
}
