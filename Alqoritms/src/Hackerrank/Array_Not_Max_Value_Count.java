package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Array_Not_Max_Value_Count {

    public static void main(String[] args) {
//        int a[] = {3, 2, 1, 3};
//        int a[] = {82, 49, 82, 82, 41, 82, 15, 63, 38, 25};
        int a[] = {18, 90, 90, 13, 90, 75, 90, 8, 90, 43};
        birthdayCakeCandles(a);
    }

    static int birthdayCakeCandles(int[] ar) {

        int max = ar[0];

        int counter = 0;

        for (int i = 0; i < ar.length; i++) {

            if (ar[i] > max) {
                max = ar[i];
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.println("max  = "+max);
            if (ar[i] == max) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;

    }
}
