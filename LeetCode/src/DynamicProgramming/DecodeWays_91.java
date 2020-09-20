package DynamicProgramming;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecodeWays_91 {
// 65 <= X <= 90
// 0  <= X <= 26

    /*
    1 A
    2 B
    . 
    .
    3 Z
    
     */
    public static void main(String[] args) {
//        String s = "12";
        String s = "226";
//        String s = "22634";
        System.out.println("Result = " + numDecodings(s));
    }

    public static int numDecodings(String s) {
        System.out.println("S = " + s);
        List<String> list = new ArrayList<>();

/////////////////PART - 1 tek tek simvollara gore axtaris
        String firstWord = "";
        for (int i = 0; i < s.length(); i++) {
            int symBolNumber = Integer.parseInt(s.charAt(i) + "");
            char symbol = (char) (symBolNumber + 64);
            firstWord += symbol;
        }
        list.add(firstWord);

/////////////////////////////////PART - 2  iki-iki subStr-lere gore axtaris
        String secodWord = "";
        for (int i = 0; i < s.length(); i++) {

            //// EGER SONA 1 HERF QALARSA ONU DACEVIRIB ELAVE ETSIN yeni STR-in sonuna
            System.out.println(i);
            if (i == s.length() - 1) {
                int symBolNumber = Integer.parseInt(s.charAt(i) + "");
                char symbol = (char) (symBolNumber + 64);
                secodWord += symbol;
                System.out.println("kkkkkkkk");
                break;
            }

            String str = s.substring(i, i + 2);
            int strNumber = Integer.parseInt(str + "");

            if (strNumber <= 26) {
                char symbol = (char) (strNumber + 64);
                secodWord += symbol;
                i++;
            } else {
                for (int j = 0; j < str.length(); j++) {
                    int symBolNumber = Integer.parseInt(str.charAt(j) + "");
                    char symbol = (char) (symBolNumber + 64);
                    secodWord += symbol;
                }
            }
//            System.out.println(i);
//            System.out.println(s.length()-1);
        }
        list.add(secodWord);

        System.out.println(list);
        return list.size();

    }
}
