package Greedy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Last_Stone_Weight_1046 {

    public static void main(String[] args) {

        int stones[] = {2, 7, 4, 1, 8, 1};

        System.out.println("Result = " + lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
        List<Integer> allStones = new ArrayList<>();

        for (int i = 0; i < stones.length; i++) {
            allStones.add(stones[i]);
        }

        allStones.sort((a, b) -> (a > b) ? -1 : (b > a) ? 1 : 0);

        while (allStones.size() > 1) {
            allStones.add(Math.abs(allStones.get(1) - allStones.get(0)));
            allStones.remove(1);
            allStones.remove(0);
            allStones.sort((a, b) -> (a > b) ? -1 : (b > a) ? 1 : 0);

//            System.out.println(allStones);

        }

        if (allStones.size() == 1) {
            return allStones.get(0);
        } else if (allStones.size() == 0) {
            return 0;
        }

        return 0;
    }
}
