package Hackerrank.SORTINGG;

import java.util.ArrayList;
import java.util.List;

public class Bigger_is_Greater {

    public static void main(String[] args) {

//        String w = "lmno";            ///   lmon
//        String w = "dcba";          ///   no answer
//        String w = "dcbb";          ///   no answer
//        String w = "abdc";          ///   acbd

//        String w = "abcd";          ///   abdc
//        String w = "fedcbabcd";     ///   fedcbabdc
//        String w = "hefg";     ///   hegf
//        String w = "dhck";     ///   dhkc
        String w = "dkhc";     ///   hcdk     c h k d     h

        System.out.println(biggerIsGreater(w));
    }
//
//
//
//
//    
//    
// Complete the biggerIsGreater function below.

    static String biggerIsGreater(String w) {
        char firstL = 0;
        int firstlIndex = 0;
        int firstLASCII = 0;

        char otherL = 0;
        int otherlIndex = 0;
        int otherLASCII = 0;

        int minLASCII = 0;

        List<Character> list = new ArrayList<>();
        boolean isSuccess = false;
        String result = "no answer";

        for (int i = 0; i < w.length(); i++) {
            list.add(w.charAt(i));
        }

        System.out.println("string    = " + w);
        System.out.println("originial = hcdk");

        
        
        
        for (int i = list.size() - 1; i >= 0; i--) {
            firstL = list.get(i);
            firstLASCII = (int) list.get(i);
            firstlIndex = i;
            minLASCII = 172;

            for (int j = i; j < list.size(); j++) {

                otherLASCII = (int) list.get(j);
                if (firstLASCII < otherLASCII) {

                    if (otherLASCII < minLASCII) {
                        minLASCII = otherLASCII;
                        otherlIndex = j;
                        isSuccess = true;
                    }
                }

            }

            if (isSuccess) {
                list.add(firstlIndex, list.get(otherlIndex));
                list.remove(otherlIndex + 1);
                break;
            }
        }
        System.out.println("list = " + list);

        
        
//    
//
//        for (int i = firstlIndex + 1; i < list.size(); i++) {
//            isSuccess = false;
//            firstL = list.get(i);
//            firstLASCII = (int) list.get(i);
//            firstlIndex = i;
//            minLASCII = 172;
//
//            for (int j = i; j < list.size(); j++) {
//
//                otherLASCII = (int) list.get(j);
//                if (firstLASCII < otherLASCII) {
//
//                    if (otherLASCII < minLASCII) {
//                        minLASCII = otherLASCII;
//                        otherlIndex = j;
//                        isSuccess = true;
//                    }
//                }
//            }
//            if (isSuccess) {
//                list.add(firstlIndex, list.get(otherlIndex));
//                list.remove(otherlIndex + 1);
//                break;
//            }
//        }


        if (isSuccess) {
            result = "";
            for (int i = 0; i < list.size(); i++) {
                result += list.get(i);
            }
        }
        return result;
    }

}
