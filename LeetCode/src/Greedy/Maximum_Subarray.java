package Greedy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maximum_Subarray {

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Result = " + maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        
        int n = (int) Math.pow(2, nums.length);
        int max = Integer.MIN_VALUE;
        
        for (int i = 1; i < n; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < nums.length; j++) {
                if (BigInteger.valueOf(i).testBit(j)) {
                    list.add(nums[j]);
                }
                int sum = 0;
                for (int k = 0; k < list.size(); k++) {
                    sum += list.get(k);
                }
                if (sum > max) {
                    max = sum;
                }
                sum=0;
                System.out.println("list = "+list);
                System.out.println("max = "+max);

            }
        }
        return max;
    }
}
