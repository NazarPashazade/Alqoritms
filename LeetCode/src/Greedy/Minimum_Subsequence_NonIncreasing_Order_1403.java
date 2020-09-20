package Greedy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_Subsequence_NonIncreasing_Order_1403 {

    public static void main(String[] args) {
//        int nums[] = {4,3,10,9,8};  /// [10,9]
//        int nums[] = {4,4,7,6,7};  /// [7,7,6]
//        int nums[] = {6};  /// [6]
//        int nums[] = {10,2,5};  /// [10]
        int nums[] = {8,8};  /// [8,8]
        System.out.println("Result = " + minSubsequence(nums));
    }

    public static List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<>();

        if(nums.length<2){
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
        }
        
        Arrays.sort(nums);
       int  k =nums.length-1;  //6
        while (k >= 0) {
            int sum1 = 0;
            int sum2 = 0;

            List<Integer> list1 = new ArrayList<>();

            for (int i = nums.length - 1; i >= 0; i--) {
                if (i >= k) {
                    sum1 += nums[i];
                    list1.add(new Integer(nums[i]));
                } else {
                    sum2 += nums[i];
                }
            }
            System.out.println("sum1 = " + sum1);
            System.out.println("sum2 = " + sum2);
            if (sum1 > sum2) {
                list.addAll(list1);
                System.out.println("etst");
                return list1;
            } else {
                k--;
            }

        }
        return list;
    }
}
