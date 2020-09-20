/*
her defe 2 muxtelif simvolu secib setirde olan hemin simvollari ayirib ayri bir setre yazmaq lazimdi
ve hemin setirler icerisinde ardicil tekrarlanma olmayan en uzun setiri qaytarmaliyam

 */
package Hackerrank.ALGORITMS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Two_Characters___EASY {

    public static void main(String[] args) {

//        CASE -0      ///  ANSWER - 5
        String s = "beabeefeab";
//
//        CASE -1      ///  ANSWER - 0
//        String s = "a";
//
//        CASE -2      ///  ANSWER - 2
//        String s = "ab";
//
//        CASE -8      ///  ANSWER - 8
//        String s = "cwomzxmuelmangtosqkgfdqvkzdnxerhravxndvomhbokqmvsfcaddgxgwtpgpqrmeoxvkkjunkbjeyteccpugbkvhljxsshpoymkryydtmfhaogepvbwmypeiqumcibjskmsrpllgbvc";
//        
//        CASE -9      ///  ANSWER - 5
//        String s = "beabeefeab";

        System.out.println(alternate(s));

    }
//
//    
//    
//    
//    

    // Complete the alternate function below.
    static int alternate(String s) {
//        System.out.println(s);

        List<String> list = new ArrayList<>();
        Set<String> set = new TreeSet<>();
        List<String> uniqueList = new ArrayList<>();
        List<String> listTwoElement = new ArrayList<>();
        String maxStr = "";
        int maxStrLength = 0;
        String letter1 = "";
        String letter2 = "";
        List<String> resultList = new ArrayList<>();
//        
//
//
//      HER HERFDEN BIRININ  SAXLANMASI   ve  Ve UMUMI LISTIN ARRAYA DOLDURULMASI
//
//

/////`  Eger soz iki muxtelif simvoldan ibaretdirse  size-ni qaytarmaliyiq
        if (s.length() == 2) {
            if (s.charAt(0) != s.charAt(1)) {
                return s.length();
            }
        }
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i) + "");
            set.add(s.charAt(i) + "");
        }

        for (String text : set) {
            uniqueList.add(text);
        }
//
//
//          her defe ferqli 2 elementi goturuR VE BIRLESIB SEKILDE   listTwoElement  bu liste yazir
//
//
//
        for (int i = 0; i < uniqueList.size(); i++) {
            for (int j = i + 1; j < uniqueList.size(); j++) {
                listTwoElement.add(uniqueList.get(i) + uniqueList.get(j));
            }

        }
//        
//
// 
//                          ALQORITM
//
//

        if (listTwoElement.size() > 1) {
            maxStrLength = 0;
            for (int i = 0; i < listTwoElement.size(); i++) {
                letter1 = "" + listTwoElement.get(i).charAt(0);
                letter2 = "" + listTwoElement.get(i).charAt(1);

                resultList.clear();
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j).equalsIgnoreCase(letter1) || list.get(j).equalsIgnoreCase(letter2)) {
                        resultList.add(list.get(j));
                    }
                }
//// SETIRLERDE TEKRARLANMANIN OLMASINI AXDARIR EGER VARSA O BIZE LAZIM DEYIL
                boolean result = false;
                for (int j = 0; j < resultList.size() - 1; j++) {
                    if (resultList.get(j).equalsIgnoreCase(resultList.get(j + 1))) {
                        result = true;
                        break;
                    }
                }

//// MAX OLCULU SETRIN TAPILMASI
                if (!result) {
//                    System.out.println(resultList);
                    if (maxStrLength < resultList.size()) {
                        maxStrLength = resultList.size();
                    }
                }

            }
        }

//        
//
//
//
//
        return maxStrLength;
    }
}
