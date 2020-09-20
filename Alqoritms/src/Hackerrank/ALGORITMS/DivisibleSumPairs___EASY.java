/*

Cemi k-a bolunen cutlerin sayini tapin


 */
package Hackerrank.ALGORITMS;

public class DivisibleSumPairs___EASY {

    public static void main(String[] args) {

        //CASE-0 
        int n = 6;
        int k = 3;
        int ar[] = {1, 3, 2, 6, 1, 2};
        System.out.println("\n result = "+divisibleSumPairs(n, k, ar));

    }

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        
//        for (int i = 0; i < ar.length; i++) {
//            System.out.print(ar[i]+" ");
//        }
//        
        
        int counter = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) % k==0) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
