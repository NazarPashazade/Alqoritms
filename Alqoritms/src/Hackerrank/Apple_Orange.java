/*

                1) Line s ,t         
                2) Line a ,b
                3) Line m ,n
                4) Line apples
                5) Line oranges

                                            CASE-0
Input :
                7 11
                5 15
                3 2
                -2 2 1
                5 -6

Output :
                1
                1

                 
 */
package Hackerrank;

public class Apple_Orange {

    public static void main(String[] args) {
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        int m = 3;
        int n = 2;
        int apples[] = {-2, 2, 1};
        int oranges[] = {5, -6};

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int appleCount = 0;
        for (int i = 0; i < apples.length; i++) {
            if (a + apples[i] >= s) {
                appleCount++;
            }
        }
        System.out.println(appleCount);

        int orangeCount = 0;
        for (int i = 0; i < oranges.length; i++) {
            if (b + oranges[i] <= t) {
                orangeCount++;
            }
        }
        System.out.println(orangeCount);
    }
}
