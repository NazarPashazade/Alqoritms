/*
		Deafult

    a b k
    1 5 3
    4 8 7
    6 9 1

Add the values of k between the indices  a and  b inclusive:

1 ci setirde  1 - 5 e  qeder ki indexde olanlara 3 elave edeciyik
2ci setirde   4 - 8-e  qeder ki indexde olanlara 7 elave edeciyik
3cu setirde  6 - 9 a   qeder ki indexde olanlara 1 elave edeciyik

        index->	   1  2  3   4   5   6   7  8  9  10
		[  0, 0, 0,  0,  0,  0,  0, 0, 0,  0  ]
		[  3, 3, 3,  3,  3,  0,  0, 0, 0,  0  ]
		[  3, 3, 3, 10,  10, 7,  7, 7, 0,  0  ]
		[  3, 3, 3, 10,  10, 8,  8, 8, 1,  0  ]

Her setirdeki elementin yerine  ozunden ustdeki elemental cemi yazilir









    		           Case – 0;

Input :

5 3           	3 – emeliyyatlarin sayi , 4 – massivin uzunllugu
1 2 100     		1.setirde 1 - 2 e qeder 100yaz 
2 5 100     		2.setirde 2 - 5 e qeder 100yaz
3 4 100     		3.setirde 3 - 4 e qeder 100yaz


Output :     200


Example :

Index -- >        1     2    3   4   5
		[ 100  100   0   0   0  ]
		[ 100  200  100 100 100 ]
		[ 100  200  200 200 100 ]
		









				Case – 1;

Input :

4 3            3 – emeliyyatlarin sayi , 4 – massivin uzunllugu
2 3 603           1.setirde 2 - 3 e qeder  603 yaz        
1 1 286           2.setirde 1 - 1 e qeder  286 yaz
4 4 882           3.setirde 4 - 4 e qeder  882 yaz


Output :    882



Index -- >          1     2    3     4    
		[   0   603   603    0    ]
		[  286  603   603    0    ]
		[  286  603   603   882   ]
		


 */
package Hackerrank.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ArrayManipulation_HARD {

    public static void main(String[] args) {

        //CASE - 0
        int n = 5;
        int queries[][] = new int[3][3];
        queries[0][0] = 1;
        queries[0][1] = 2;
        queries[0][2] = 100;
        queries[1][0] = 2;
        queries[1][1] = 5;
        queries[1][2] = 100;
        queries[2][0] = 3;
        queries[2][1] = 4;
        queries[2][2] = 100;
//        CASE - 1
//        int n = 4;
//        int queries[][] = new int[3][3];
//        queries[0][0] = 2;
//        queries[0][1] = 3;
//        queries[0][2] = 603;
//        queries[1][0] = 1;
//        queries[1][1] = 1;
//        queries[1][2] = 286;
//        queries[2][0] = 4;
//        queries[2][1] = 4;
//        queries[2][2] = 882;

        System.out.println("MAX = " + arrayManipulation(n, queries));
    }
//
//   
//    
//    
//    
//    
//    
//    
//    
    // Complete the arrayManipulation function below.

    static long arrayManipulation(int n, int[][] queries) {

        Integer a = 0;
        Integer b = 0;
        Integer k = 0;
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(0l);
        }

//////----------------------   Son setrin alinmasi----------------------------////
        for (int i = 0; i < queries.length; i++) {
            a = queries[i][0] - 1;   // 0
            b = queries[i][1] - 1;   // 1
            k = queries[i][2]; // 100

            for (int j = a; j <= b; j++) {
//                arr[j] += k;
                list.set(j, list.get(j) + k);
            }

        }

        return Collections.max(list);
    }
}
