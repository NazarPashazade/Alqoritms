package Hackerrank;

import java.util.HashSet;


/*
 
0 dan basliyib 0a qayidanda 1  dere sayilir


 */
public class CountingValleys {

    public static void main(String[] args) {

        //////////////////////////////Case 0                     1
//        int n = 8;
//        String s = "UDDDUDUU";
        ///////////////////////////////Case 1                     2
//        int n = 12;
//        String s = "DDUUDDUDUUUD";
        ///////////////////////////////Case 2                     0
//        int n = 10;
//        String s = "UDUUUDUDDD";
        ///////////////////////////////Case 3                     2
//        int n = 10;
//        String s = "DUDDDUUDUU";
        ///////////////////////////////Case 4                     1
//        int n = 10;
//        String s = "DDUDDUUDUU";
        ///////////////////////////////Case 5                     1
//        int n = 10;
//        String s = "UDDDUDUDUU";
        ///////////////////////////////Case 6                     2
        int n = 100;
        String s = "+";

        System.out.println("tepe sayi   = " + countingValleys(n, s));

    }

    static int countingValleys(int n, String s) {
        HashSet<Integer> set = new HashSet<Integer>();
        int result = 0;
        int valley = 0;

        for (int i = 0; i < n; i++) {// en son i=6 olur

            if (s.charAt(i) == 'U') {
                valley++;
            }

            if (s.charAt(i) == 'D') {
                valley--;
            }

            if (s.charAt(i) == 'U' && valley == 0) {
                result++;
            }
        }


        return result;
    }
}
