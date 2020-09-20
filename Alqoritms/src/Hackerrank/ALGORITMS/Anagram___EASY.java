package Hackerrank.ALGORITMS;

import java.util.ArrayList;
import java.util.List;

public class Anagram___EASY {

    public static void main(String[] args) {
//Case-0
//        String s = "aaabbb";      // 3
//        String s = "ab";          // 1
//        String s = "abc";         //-1
//        String s = "mnop";        // 2
//        String s = "xyyx";        // 0
        String s = "xaxbbbxx";   // 1
        System.out.println(anagram(s));
    }

    // Complete the anagram function below.
    static int anagram(String s) {

        if (s.length() % 2 != 0) {
            return -1;
        }

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        int counter1 = 0;
        int counter2 = 0;
        int n = 0;

        for (int i = 0; i < s.length() / 2; i++) {
            list1.add("" + s.charAt(i));
        }

        for (int i = s.length() / 2; i < s.length(); i++) {
            list2.add("" + s.charAt(i));
        }
//
//        
//        
//        
//        
// 

        System.out.println(s);
        System.out.println(list1);
        System.out.println(list2);
        n = list1.size();

        for (int i = 0; i < s.length() / 2; i++) {
            String letter = list1.get(i);
            counter1 = 0;
            counter2 = 0;
            boolean isExist = false;
            for (int j = 0; j < i; j++) {
                if (letter.equalsIgnoreCase(list1.get(j))) {
                   isExist=true;
                   break;
                }
            }
            if(isExist){
               continue;
            }
            for (int j = 0; j < list1.size(); j++) {
                if (letter.equalsIgnoreCase(list1.get(j))) {
                    counter1++;
                }
            }

            for (int j = 0; j < list2.size(); j++) {
                if (letter.equalsIgnoreCase(list2.get(j))) {
                    counter2++;
                }
            }
//
//            System.out.println("c1 = " + counter1);
//            System.out.println("c2 = " + counter2);

            if (counter1 != counter2) {
                if (counter1 > counter2) {
                    for (int k = 0; k < counter1 - counter2; k++) {
                        list2.add(letter);
                    }
                } else if (counter1 < counter2) {
                    for (int j = 0; j < counter2 - counter1; j++) {
                        list1.add(letter);
                    }
                }

            }

        }

        System.out.println(s);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        return list2.size() - n;// evvel 3 idise size indide 5 dise demek 2 simvol elave edilib
    }
}
