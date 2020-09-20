package Hackerrank;

public class LeftRotateArray {

    public static void main(String[] args) {

//            CASE - 2      OUTPUT  -   87 97 33 47 70 37 8 53 13 93 71 72 51 100 60
//        int d = 13;
//        int a[] = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
//
//            CASE - 1      OUTPUT  -   77 97 58 1 86 58 26 10 86 51 41 73 89 7 10 1 59 58 84 77
//        int d = 10;
//        int a[] = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
//        
//
//            CASE - 3      OUTPUT  -   5 1 2 3 4
        int d = 4;
        int a[] = {1 ,2 ,3 ,4, 5};
//        

        rotLeft(a, d);
    }

    static int[] rotLeft(int[] a, int d) {

        int result[] = new int[a.length];

        int ferq = a.length - d;
        
        int j = 0;
        for (int i = d; i < a.length; i++) {
            result[j] = a[i];
            j++;
        }

        for (int i = 0; i < d; i++) {
            result[i + ferq] = a[i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        return result;
    }

}
