package Hackerrank.SORTINGG;

public class MinSwaps {

    public static void main(String[] args) {
//               CASE-0
        int arr[] = {4, 3, 1, 2};
//
//
//               CASE-1
//        int arr[] = {2, 3, 4, 1, 5};
//
//
//               CASE-2
//        int arr[] = {4, 3, 1, 2};

        System.out.println(minimumSwaps(arr));
    }

    static int minimumSwaps(int[] arr) {
        int counter = 0;
        int temp = 0;

        for (int t = 0; t < arr.length - 1; t++) {

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[t] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    counter++;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.err.print(arr[i]);
            }
            System.out.println("");
        }

        return counter;
    }
}
