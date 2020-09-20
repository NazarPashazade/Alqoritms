package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class NewClass {

    public static void main(String[] args) {
//        String s = "12";
        String s = "226235";
//        String s = "22634";
        System.out.println("Result = " + numDecodings(s));
    }

    public static int numDecodings(String s) {
        System.out.println("S = " + s);
        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            System.out.println("i = " + i);
            if (i == s.length() - 1) {
                int symBolNumber = Integer.parseInt(s.charAt(i) + "") + 64;

                for (List<Integer> list : lists) {
                    list.add(symBolNumber);
                }

                break;
            } else {

///////////////////ESAS BU HISSEDIR
                String str = s.substring(i, i + 2);
                int strNumber = Integer.parseInt(str + "");

                if (strNumber <= 26) {

                    List<Integer> list1 = new ArrayList<>();
                    list1.add(strNumber + 64);
                    lists.add(list1);

                    
                    List<Integer> list2 = new ArrayList<>();
                    for (int j = 0; j < str.length(); j++) {
                        int symbolNumber = Integer.parseInt(str.charAt(j) + "") + 64;
                        list2.add(symbolNumber);
                    }
                    lists.add(list2);
                    i++;

                    
//                    List<Integer> list3 = new ArrayList<>();
//                    int symbolNumber = Integer.parseInt(str.charAt(0) + "") + 64;
//                    lists.add(list3);
                    

                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(strNumber);
                    lists.add(list);
                }
            }
        }
        System.out.println(lists);
        return 0;
    }

}
///////////////////////////////////PART - 2  iki-iki subStr-lere gore axtaris
//    String secodWord = "";
//    for (int i = 0;
//
//    i< s.length ();
//    i
//
//    
//        ++) {
//
//            //// EGER SONA 1 HERF QALARSA ONU DACEVIRIB ELAVE ETSIN yeni STR-in sonuna
//            System.out.println(i);
//        if (i == s.length() - 1) {
//            int symBolNumber = Integer.parseInt(s.charAt(i) + "");
//            char symbol = (char) (symBolNumber + 64);
//            secodWord += symbol;
//            System.out.println("kkkkkkkk");
//            break;
//        }
//
//        String str = s.substring(i, i + 2);
//        int strNumber = Integer.parseInt(str + "");
//
//        if (strNumber <= 26) {
//            char symbol = (char) (strNumber + 64);
//            secodWord += symbol;
//            i++;
//        } else {
//            for (int j = 0; j < str.length(); j++) {
//                int symBolNumber = Integer.parseInt(str.charAt(j) + "");
//                char symbol = (char) (symBolNumber + 64);
//                secodWord += symbol;
//            }
//        }
//
//    }
//
//    list.add (secodWord);
//
//    System.out.println (list);
//
//
//return 0;
//
//    }
//}
