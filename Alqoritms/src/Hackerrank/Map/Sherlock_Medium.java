/*
                          **********---CASE-0---********
Input  :
            2
            abba
            abcd
Output :
            4
            0

                          *******----CASE-1----**********

 Input  :
            2
            ifailuhkqq
            kkkk

Output  :
            3
            10

                          *******----CASE-2----**********

 Input  :
            1
            cdcd

Output  :
            5



example :   
            0 1 2 3      Index
            c d c d

(0,2)     -->1
(1,3)     -->2
(01,12)   -->3
(01,23)   -->4
(12,23)   -->5

 */
package Hackerrank.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Sherlock_Medium {

    public static void main(String[] args) {
//        String s = "ifailuhkqq";  //*********   CASE - 0  **********  ANSWER - 3  *******
        String s = "kkkk";  //*********   CASE - 1  **********  ANSWER - 10  *******
//        String s = "cdcd";  //*********   CASE - 2  **********  ANSWER - 5  *******
//        String s = "ifailuhkqqhucpoltgtyovarjsnrbfpvmupwjjjfiwwhrlkpekxxnebfrwibylcvkfealgonjkzwlyfhhkefuvgndgdnbelgruel";  //*********   CASE - 3  **********  ANSWER - 499  *******

        System.out.println(sherlockAndAnagrams(s));
    }

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {

        int counter = 0;

        for (int t = 1; t < s.length(); t++) {  /// t=1 1reqemli , t=2 2 reqemli  ve sair.

            for (int i = 0; i < s.length(); i++) {
                List<String> list1 = new ArrayList<>();
                List<String> list2 = new ArrayList<>();
                list1.clear();

                for (int k = i; k < t + i; k++) {
                    if (k < s.length()) {
                        list1.add(s.charAt(k) + "");
                    }
                }
//////////  " length - t +1 " olma sebebi odurki , 
//meselen 2 reqemlilerin icinde axdaranda sondaki 1 rerqmi axdarmasin ve ya 
// 3 reqemlileri axdaranda sondaki 2 reqemi axdarmasin ve sair.
/// " i+1 " -den baslamasinin sebebi ise odur ki, her defe ozunden sonraki elementden baslayib axdarsin
                for (int j = i + 1; j < s.length() - t + 1; j++) {
                    list2.clear();

                    for (int k = j; k < t + j; k++) {   //t=2
                        if (k < s.length()) {
                            list2.add(s.charAt(k) + "");
                        }
                    }

                    boolean result = true;
                    Collections.sort(list1);
                    Collections.sort(list2);
                    for (int k = 0; k < list1.size(); k++) {
                        if (!list1.get(k).equalsIgnoreCase(list2.get(k))) {
                            result = false;
                        }

                    }
                    if (result) {
                        counter++;
                    }
//                    
//                    System.out.println("list1 = "+list1);
//                    System.out.println("list2 = "+list2+"\n");

                }
            }

        }

        return counter;
    }

}
