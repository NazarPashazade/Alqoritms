package Hackerrank.DataStructur;

public class Array2D___EASY {

    public static void main(String[] args) {
        int arr[] = {1,4,3,2};   //    1   4   3   2
        System.out.println(reverseArray(arr));

    }

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int b[] = new int[a.length];
        int n=a.length;
        
        for (int i = n - 1; i > -1; i--) {
            b[n-1-i] = a[i];
        }

        return b;
    }
}
