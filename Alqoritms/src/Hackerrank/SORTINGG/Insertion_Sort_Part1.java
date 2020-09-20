package Hackerrank.SORTINGG;

public class Insertion_Sort_Part1 {

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 3};
        int n = 5;
        insertionSort1(5, arr);
    }

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        int temp = 0;
        int k = 0;
        int l = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    k = arr[j];
                    l = j;
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (j == l) {
                    System.out.print(k+" ");
                } else {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.print("\n");

            boolean isSame = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSame = true;
                }
            }
            if (!isSame) {
                break;
            }

        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}
