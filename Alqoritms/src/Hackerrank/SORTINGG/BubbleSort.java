package Hackerrank.SORTINGG;

/*

    {3,2,1}   --->  {2,3,1}
    {2,3,1}   --->  {2,1,3}
    {2,1,3}   --->  {1,2,3}
input  --- 3  2  1 
output ---  Array is sorted in 3 swaps.
            First Element: 1
            Last Element: 3
 */
public class BubbleSort {

    public static void main(String[] args) {
//        case 0         // 3 step
//        int a[] = {3, 2, 1};
//
//        case 1        // 0 step
//        int a[] = {1, 2, 3};
//
//        case 3        //5 step
        int a[] = {4, 2, 3, 1};
        //
        countSwaps(a);
    }

    static void countSwaps(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("------------------------------------------------");

        int counter = 0;
        for (int t = 0; t < a.length - 1; t++) {

            for (int i = 0; i < a.length - 1; i++) {

                int temp = a[i];           //3

                if (a[i] > a[i + 1]) {
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    counter++;

                }
            }

        }
        System.out.println("Array is sorted in " + counter + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);

    }

}
