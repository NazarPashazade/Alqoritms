package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maximize_Sum_Of_Array_After_Negations_1005 {

    public static void main(String[] args) {
//        int A[] = {4, 2, 3};
//        int K = 1;
//
//        int A[] = {2, -3, -1, 5, -4};
//        int K = 2;
//
        int A[] = {3, -1, 0, 2};
        int K = 3;

        System.out.println("Result = " + largestSumAfterKNegations(A, K));
    }

    public static int largestSumAfterKNegations(int[] A, int K) {

        int sum = 0;

        for (int j = 0; j < K; j++) {

            ////      FIND MIN 
            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int p = 0; p < A.length; p++) {
                if (min > A[p]) {
                    min = A[p];
                    minIndex = p;
                }
            }
            ////     -x   --->   +x
            A[minIndex] = (-1) * min;
        }

        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

//            for (int t = 0; t < A.length; t++) {
//                System.out.print(A[t] + "  ");
//            }
//            System.out.println("");
        return sum;
    }

}
