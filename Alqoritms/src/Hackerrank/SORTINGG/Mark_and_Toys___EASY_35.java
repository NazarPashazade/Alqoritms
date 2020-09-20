package Hackerrank.SORTINGG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mark_and_Toys___EASY_35 {

    public static void main(String[] args) {
        //////////////////Case-1;     4
//        int k = 50;
//        int prices[] = {1, 12, 5, 111, 200, 1000, 10};

        //////////////////Case-2;    3
        int k = 7;
        int prices[] = {1, 2, 3, 4};

        System.out.println("result = " + maximumToys(prices, k));

    }

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {

        List<Integer>list=new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            list.add(prices[i]);
        }
        Collections.sort(list);
        
        int i = 0, sum = 0, counter = 0;
        while (list.size() > i) {
            if (list.get(i) < k) {
                sum += list.get(i);
                counter++;
            }
            if (sum > k) {
                sum-=list.get(i);
                counter--;
                break;
            }
            i++;

        }
//        System.out.println(sum);
        return counter;
    }
}
