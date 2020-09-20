package Hackerrank.ALGORITMS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Making_Anagrams___EASY {

    public static void main(String[] args) {
//        //CASE-0         4
//        String s1 = "cde";
//        String s2 = "abc";
        //CASE-1         30
        String s1 = "fcrxzwscanmligyxyvym";
        String s2 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        System.out.println(makingAnagrams(s1, s2));
    }

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        boolean isExist = false;
        int result = 0;
        int list1Length = 0;
        int list2Length = 0;
        int c1 = 0;
        int c2 = 0;
//
//
//
//        
//      stringlerin Listlere doldurulmasi 
//      
//
//
        for (int i = 0; i < s1.length(); i++) {
            list1.add("" + s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            list2.add("" + s2.charAt(i));
        }
        list1Length = list1.size();
        list2Length = list2.size();

//        Collections.sort(list1);
//        Collections.sort(list2);

//        System.out.println(list1);
//        System.out.println(list2);
//
//
//
//        
//      Eynilerin secilib yeni liste yazilmasi
//      
//
//
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equalsIgnoreCase(list2.get(j))) {
                    list3.add(list1.get(i));
                    break;
                }
            }
        }

        for (int i = 0; i < list2.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                if (list2.get(i).equalsIgnoreCase(list1.get(j))) {
                    list4.add(list2.get(i));
                    break;
                }
            }
        }

//        System.out.println("list3 = " + list3);
//        System.out.println("list4 = " + list4);

//
//
//
//        
//     Eyni elemenlerin silinmesi
//      
//
//
        for (int i = 0; i < list3.size(); i++) {
            c1 = 0;
            c2 = 0;
            String letter = list3.get(i);
            for (int j = 0; j < list3.size(); j++) {
                if (letter.equalsIgnoreCase(list3.get(j))) {
                    c1++;
                }
            }
            for (int j = 0; j < list4.size(); j++) {
                if (letter.equalsIgnoreCase(list4.get(j))) {
                    c2++;
                }
            }

            if (c1 > c2) {
                for (int j = 0; j < c1 - c2; j++) {
                    list3.remove(letter);
                    i--;
                }
            }
            if (c1 < c2) {
                for (int j = 0; j < c2 - c1; j++) {
                    list4.remove(letter);

                }
            }
        }

//        System.out.println("\n\n");
//        System.out.println("list1 = " + list1);
//        System.out.println("list2 = " + list2);
        result = (list1Length - list3.size()) + (list2Length - list4.size());
        return result;
    }

}
