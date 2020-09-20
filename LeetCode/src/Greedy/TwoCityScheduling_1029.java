package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoCityScheduling_1029 {

    public static void main(String[] args) {

//        int costs[][] = {{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}}; /////// 1859
        int costs[][] = {{515, 563}, {451, 713}, {537, 709}, {343, 819}, {855, 779}, {457, 60}, {650, 359}, {631, 42}};  /////3086
//        int costs[][] = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};   //110
        System.out.println("Result = " + twoCitySchedCost(costs));
    }

    public static int twoCitySchedCost(int[][] costs) {
        List<List<Integer>> lists = new ArrayList<>();
        int sum = 0;

        /////// ARADAKI MAX FERQ-e GORE SORT ETDIM Listleri
        int maxDiff = 0;
        int maxDiff2 = 0;
        for (int i = 0; i < costs.length; i++) {
            maxDiff = Integer.MIN_VALUE;

            for (int[] cost : costs) {
                int diff = Math.abs(cost[0] - cost[1]);
                if (i > 0 && maxDiff2 <= diff) {
                    continue;
                }
                if (maxDiff < diff) {
                    maxDiff = diff;
                }
            }
            maxDiff2 = maxDiff;
            for (int[] cost : costs) {
                int diff = Math.abs(cost[0] - cost[1]);
                if (maxDiff == diff) {
                    List<Integer> list = new ArrayList<>();
                    list.add(cost[0]);
                    list.add(cost[1]);
                    lists.add(list);
                }
            }
        }
        /////// ALQORITM
        System.out.println("List  = " + lists);
        int cityA = 0, cityB = 0;
        for (int i = 0; i < lists.size(); i++) {
            List<Integer> list = lists.get(i);
            System.out.println(list);
            int minVal = 0;

            if (list.get(0) < list.get(1)) {
                minVal = list.get(0);
                cityA++;
            } else {
                minVal = list.get(1);
                cityB++;
            }
            if (cityB >lists.size()/2) {
                sum += list.get(0);
            } else if (cityA > lists.size()/2) {
                sum += list.get(1);
            } else {
                sum += minVal;
            }
        }
        return sum;
    }
}
