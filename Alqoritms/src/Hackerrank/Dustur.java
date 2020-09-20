/*


 Input

                            2     // t
                            0 2 10          // a0=0 , b=2 ,n=0
                            5 3 5           // a0=5 , b=3 ,n=5
 Output

                            2 6 14 30 62 126 254 510 1022 2046
                            8 14 26 50 98


s0 =  a+ pow(2,0) *b = 0+1 *2 = 2
s1 =  a+ ( pow(2,0) *b )  + ( pow(2,1) *b )  =0 +  (1 *2) + (2 *2) = 0 + 2 +4 =6
s2 =  a+ ( pow(2,0) *b )  + ( pow(2,1) *b ) + ( pow(2,2) *b )  = 0 + 2 +4 +8 =14
..... 
... 

...  s10=2046
 */
package Hackerrank;

import java.util.Scanner;

public class Dustur {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.println("-----------------");
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum+= (Math.pow(2, j) * b);   // 2 
                System.out.print(sum+" ");
            }
            System.out.println("");
        }
    }
}
