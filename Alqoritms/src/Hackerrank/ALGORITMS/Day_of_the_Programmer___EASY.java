
/*
1700<year<2700

1699 cu ilde fevral - 28 
1700 cu ilde fevral - 29 

 */
package Hackerrank.ALGORITMS;

import java.util.Calendar;

public class Day_of_the_Programmer___EASY {

    public static void main(String[] args) {
        ////   CASE-0      ///ANSWER 12.09.2016
//        int year = 2016;
        ////   CASE-1      ///ANSWER 12.09.1800
//        int year = 1800;
//           CASE-2      ///13.09.2017
//        int year = 2017;

//           CASE-3      ///13.09.2017
//        int year = 2015;
        //           CASE-4      ///13.09.2100
        int year = 2100;
//
        System.out.println(dayOfProgrammer(year));

    }

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        String result = "";

        final int programmerOfDay = 256;
        int january = 31;
        int february = 29;
        final int march = 31;
        final int april = 30;
        final int may = 31;
        final int june = 30;
        final int july = 31;
        final int august = 31;
        final int september = 30;
        final int october = 31;
        final int novermber = 30;
        final int december = 31;
        int first8MonthOfDays = 0;
        int day = 0;

        for (int i = 1701; i <= year;) {  /// Fevral 3 il 28  1il 29 olur
            if (year >= i && year <= i + 2) {   // 1701-7703
                february = 28;
                break;
            }
            i = i + 4;
        }
        if (year < 1918) {
            february = 14;
            january = 32;
        } else if (year == 1918) {
            february = 14;
            january = 31;
        } else {

        }

        first8MonthOfDays = january + february + march + april + may + june + july + august;

        day = programmerOfDay - first8MonthOfDays;

        result = day + ".0" + 9 + "." + year;
        return result;
    }
}
