
/* 
input
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

output  : 19

1 1 1   1 1 0   1 0 0   0 0 0   0 1 0   1 0 0 
  1       0       0       0       1       1       vs sair bu qaydayla davam eden 16 dene alinir elemenleri cemi mak olani tapmaliyiq.
1 1 1   1 1 0   1 0 0   0 0 0   0 0 2   0 2 4


2 4 4
  2
1 2 4 

2+4+5+2+1+2+4=19

*/
package Hackerrank.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Arrays2D {

    /// Massivin doldurulub ,metodun cagrilmagi
    public static void main(String[] args) {
        Random r = new Random();

        int arr[][] = new int[6][6];
        int max = 9;
        int min = 0;
        int range = max - min + 1;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = r.nextInt(range) - min;
            }
        }

        System.out.println(hourglassSum(arr));
    }
//    
//    
//    
//    
//
//      t -- setirler uzre 3x3 kvadratlar bitende novbeti setire dusmesi ucundur
//      z -- ilk 3x3 kvadrat bitenden sonra novbesi kvadrata kecmek ucundur
//      setir   i
//      sutun   j
//      t ve z in 4 e qeder davam etmesinin sebebi bir setirde max 4 kvadrat ola bileceidir
//    
//    
//    
    static int hourglassSum(int[][] arr) {

        int maxSumNumber = 0;
        String newArr = "";
        List<String> newArrs = new ArrayList<String>();

        int sumNumbers = 0;
        List<Integer> sumNumbersArr = new ArrayList<>();

//****************************************** PART - 1 *******************************************************
////////////////        Masssivin capa verilmesi
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + "     ");
            }
            System.out.println("\n");
        }
        System.out.println("\n\n\n");

//**************************************** PART - 2 ***********************************************************
//////////// 3x3 sekline salinmasi ve ekaran verilmesi 
//////////// 3x3 matrsinin Butun elemnlerinin ardicil Stringe yigilmasi      
//////////// Hemin Stringlerin massive yigilmasi
        for (int t = 0; t < 4; t++) {
            for (int z = 0; z < 4; z++) {
                newArr = "";
                for (int i = t; i < t + 3; i++) {
                    for (int j = z; j < z + 3; j++) {
                        newArr = newArr + arr[i][j] + " ";
                        System.out.print(arr[i][j] + "    ");
                    }
                    System.out.println("\n");
                }
                newArrs.add(newArr.substring(0, newArr.length() - 1));           ///////Sondaki  * u silmek ucun Substring etdim
                System.out.println("\n");
            }

        }
//************************************ PART - 3 *****************************************************

///////////// String tipindeki masssivden split edib stringleri almaq
        for (String str : newArrs) {
            String numbers[] = str.split(" ");

//            
//   x x x
//     x
//   x x x
//////// yuxaridaki sekilde x larin yerinde duran ededlerin ceminin tapilmasi  
            sumNumbers = 0;
            for (int i = 0; i < numbers.length; i++) {
                int number = Integer.parseInt(numbers[i]);
                if (i == 3 || i == 5) {
                    number = 0;
                }
                sumNumbers += number;
            }
            sumNumbersArr.add(sumNumbers);
        }

//****************************************** PART - 4 **********************************************************
///////////////////// Max Cemin tapilmasi 
        maxSumNumber = sumNumbersArr.get(0);

        for (Integer sum : sumNumbersArr) {
            System.out.println("Cem " + sum);

            if (maxSumNumber < sum) {
                maxSumNumber = sum;
            }
        }
        return maxSumNumber;

    }//Method

}//Class
