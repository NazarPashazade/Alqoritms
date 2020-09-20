package Hackerrank.ALGORITMS;

public class Candies___GREEDY__MEDIYM_50 {

    public static void main(String[] args) {
        int arr[] = {2, 4, 2, 6, 1, 7, 8, 9,10, 2, 1};//19
        int n = arr.length;

//        int arr[] = {1, 2, 2};///4
//        int n = arr.length;
        
//        int arr[] = {2, 4, 3, 5, 2, 6, 4, 5};//12
//        int n = arr.length;
        System.out.println("Result = " + candies(n, arr));
    }

    static long candies(int n, int[] arr) {
        int b[] = new int[arr.length];
        int k = 1;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

        System.out.println("");
        b[0] = 1;
        int diff = 0;

        for (int i = 0; i < n - 1; i++) {
//            System.out.println("b[i] = " + b[i]);

            if (arr[i] < arr[i + 1]) {
                k++;
                b[i + 1] = k;
            } else {
                k--;
//                if (b[i] > 2) {
                    diff = b[i] - (b[i]-1);
                    b[i + 1] = diff;
//                } else {
//                    b[i + 1] = 1;
//                }

            }

        }
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
            System.out.print(b[i] + "  ");
        }
//        System.out.println("");
        return sum;
    }

}
