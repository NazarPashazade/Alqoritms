/*

Setir ve sutun elementlerinin ve ya dioqanal elementlerinin cemi eyni olmalidir yeni matrisde

yeni matrise tamamlamaq ucun lazim ededlerden kohne ededleri cixib alinan ferqleri topluyub geri qaytaracagiq
mes  s[2][2] de 5 yazilib amma 6 olmalidi     ferq=|5-6|=1
     s[2][0] da 3 yazilib amma 6 olmalidi     ferq=|4-6|=2
     s[1][2] da 9 yazilib amma 2 olmalidi     ferq=|9-2|=7


cem=2+1+7=10 geriqayitmalidi
 */
package Hackerrank.ALGORITMS;

import java.util.ArrayList;
import java.util.List;

public class FormingaMagicSquare___MEDIUM {

    public static void main(String[] args) {
////// DEFAULT   CASE 
//        int s[][] = new int[3][3];
//        s[0][0] = 5;
//        s[0][1] = 3;
//        s[0][2] = 4;
//        s[1][0] = 1;
//        s[1][1] = 5;
//        s[1][2] = 8;
//        s[2][0] = 6;
//        s[2][1] = 4;
//        s[2][2] = 2;

        ///  DEFAULT   CASE 
        int s[][] = new int[3][3];///
        s[0][0] = 4;
        s[0][1] = 8;
        s[0][2] = 2;
        s[1][0] = 4;
        s[1][1] = 5;
        s[1][2] = 7;
        s[2][0] = 6;
        s[2][1] = 1;
        s[2][2] = 6;
        System.out.println(formingMagicSquare(s));
    }

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {

        int rowSum = 0;
        int columnSum = 0;
        int standartSum = 0;
        int sum = 0;
        int ferqler = 0;
        int ferq = 0;
        int d1 = s[0][0] + s[1][1] + s[2][2];
        int d2 = s[0][2] + s[1][1] + s[2][0];
        int min = 0;
        int max = 0;

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        int maxD = d1;
        if (d1 > d2) {
            maxD = d1;
        } else if (d2 > d1) {
            maxD = d2;
        }
//        
//
//

        ///////// ARRAY TO OUTPUT
        for (int i = 0; i < s.length; i++) {
            sum = 0;
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j] + " ");
                sum += s[i][j];
            }
            System.out.println("");
        }
        System.out.println("\n");
//
//
//
//


        //// ALQORITM
        for (int i = 0; i < s.length; i++) {
            rowSum = 0;
            columnSum = 0;
            /////////----------------ROW------------------------
            for (int j = 0; j < s[i].length; j++) {
                rowSum += s[i][j];
            }

            ///eger SETIR in elemeleri cemi normalda olduguna beraber deilse MAX elementden -hemin ededi
            if (rowSum > maxD) {
                max = s[i][0];
                for (int j = 0; j < s[i].length; j++) {
                    if (max < s[i][j]) {
                        max = s[i][j];
                    }

                }
                ferq = Math.abs(maxD - rowSum);
                ferqler += ferq;
                System.out.println("ferq = " + ferq);
                for (int j = 0; j < s[i].length; j++) {
                    if (s[i][j] == max) {
                        s[i][j] = max - ferq;
                    }
                }
            } else if (rowSum < maxD) {
                min = s[i][0];
                for (int j = 0; j < s[i].length; j++) {
                    if (min > s[i][j]) {
                        min = s[i][j];
                    }
                }
                ferq = Math.abs(maxD - rowSum);
                ferqler += ferq;
                System.out.println("ferq = " + ferq);
                for (int j = 0; j < s[i].length; j++) {
                    if (s[i][j] == min) {
                        s[i][j] = min + ferq;
                    }
                }
            }
//
//
//
            /////////----------------COLUMN------------------------
            for (int j = 0; j < s[i].length; j++) {
                columnSum += s[j][i];
            }

            ///eger SUTUN un elemeleri cemi normalda olduguna beraber deilse MAX elementden -hemin ededi
            if (columnSum > maxD) {
                max = s[0][i];
                for (int j = 0; j < s[i].length; j++) {
                    if (max < s[j][i]) {
                        max = s[j][i];
                    }
                }
                ferq = Math.abs(maxD - rowSum);
                ferqler += ferq;
                System.out.println("ferq = " + ferq);
                System.out.println("----------------max = " + max);
                for (int j = 0; j < s[i].length; j++) {
                    if (s[j][i] == max && (s[i][0]+s[i][1]+s[i][2]) != maxD) {
                        s[j][i] = max - ferq;
                    }
                }

            } else if (columnSum < maxD) {
                min = s[0][i];
                for (int j = 0; j < s[i].length; j++) {
                    if (min > s[j][i]) {
                        min = s[j][i];
                    }
                }
                ferq = Math.abs(maxD - rowSum);
                ferqler += ferq;
                System.out.println("ferq = " + ferq);
                for (int j = 0; j < s[i].length; j++) {
                    if (s[j][i] == min && (s[i][0]+s[i][1]+s[i][2]) != maxD) {
                        s[j][i] = min + ferq;
                    }
                }

            }
        }

//
//
//
        ///OUTPUT ARRAY
        for (int i = 0; i < s.length; i++) {
            sum = 0;
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j] + " ");
                sum += s[i][j];
            }
            System.out.println("");
        }
        System.out.println("\n");

        return ferqler;
    }
}
