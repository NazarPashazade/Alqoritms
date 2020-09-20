/*

nece EDED Cemi "d" olan "m" sayda skalat kvadrati  duzeltmek olar 


 */
package Hackerrank.ALGORITMS;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate___EASY {

    public static void main(String[] args) {

//        ////CASE - 0;   ANSWER - 0
//        int d = 3;  // CEMI
//        int m = 2;  // Skalatin  KVADRATlari  SAYI
//        List<Integer> s = new ArrayList<>();
//        s.add(1);
//        s.add(1);
//        s.add(1);
//        s.add(1);
//        s.add(1);
//        s.add(1);


//        ////CASE - 1;   ANSWER - 2
//        int d = 3;
//        int m = 2;
//        List<Integer> s = new ArrayList<>();
//        s.add(1);
//        s.add(2);
//        s.add(1);
//        s.add(3);
//        s.add(2);

        ////CASE - 2;   ANSWER - 1
        int d = 4;
        int m = 1;
        List<Integer> s =new ArrayList<>();
        s.add(4);


        System.out.println("result = " + birthday(s, d, m));
    }

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int squareCount = 0;

        System.out.println(s);   //[1, 2, 1, 3, 2]
        System.out.println(" cem d  = " + d);  //3
        System.out.println(" kvadrat sayi m = " + m);  //2

        for (int i = 0; i < s.size(); i++) {

            int cem = 0;
            if (i + m <= s.size()) {
                for (int j = i; j < i + m; j++) {
                    cem += s.get(j);
                }
            }
            if (cem == d) {
                squareCount++;
            }

        }
        return squareCount;
    }
}
