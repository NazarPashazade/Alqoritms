package DynamicProgramming;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniquePaths_62 {

    public static void main(String[] args) {
//        int m = 3, n = 2;
//        int m = 7, n = 3;
        int m = 3, n = 7;
//        int m = 7, n = 4;

        System.out.println("Reult : " + uniquePaths(m, n));
    }

    public static int uniquePaths(int m, int n) {
        int arr[] = new int[m];

        for (int i = 0; i < m; i++) {
            if (i == 0) {
                arr[0] = 1;
            } else {
                arr[i] = arr[i - 1] + n - 2;
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "  ");
            sum+=arr[i];
        }
        
//        System.out.println("");
        return sum;
    }

}
