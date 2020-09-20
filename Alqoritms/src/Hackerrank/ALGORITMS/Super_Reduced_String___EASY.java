package Hackerrank.ALGORITMS;

import java.util.ArrayList;
import java.util.List;

public class Super_Reduced_String___EASY {

    public static void main(String[] args) {
//        Case-0      helli    -    aaabccddd → abccddd → abddd → abd
//        String s = "aaabccddd";   ///ANSWER ---abd
//
//        Case-1     
//        String s = "aa";   ///ANSWER ---Empty String
//        
//        
//        Case-2      
//        String s = "baab";   ///ANSWER ---Empty String
//        
//        
//        Case-3      
        String s = "ppffccmmssnnhhbbmmggxxaaooeeqqeennffzzaaeeyyaaggggeessvvssggbbccnnrrjjxxuuzzbbjjrruuaaccaaoommkkkkxx";   ///ANSWER ---Empty String

        System.out.println(superReducedString(s));
    }

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        System.out.println(s);

        String result = "";
        List<String> letters = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            letters.add(s.charAt(i) + "");
        }

        ////Array bos olana qeder dovr gedirem 
        while (!letters.isEmpty()) {

            ////eyni olanlari silirem her ikisin
            int j = 0;
            while (j < letters.size() - 1) {
                if (letters.get(j).equalsIgnoreCase(letters.get(j + 1))) {
                    letters.remove(j + 1);
                    letters.remove(j);
                }
                j++;
            }
            //// Eger eyni olan varsa resukttt true olacaq
            int t = 0;
            boolean resulttt = false;
            while (t < letters.size() - 1) {
                if (letters.get(t).equalsIgnoreCase(letters.get(t + 1))) {
                    resulttt = true;
                }
                t++;
            }
            //// Eger eyni olan YOXDURSA cixacaq dovrden
            if (resulttt == false) {
                break;
            }
        }

        if (letters.isEmpty()) {
            result = "Empty String";
        } else {
            for (int i = 0; i < letters.size(); i++) {
                result += letters.get(i);
            }
        }

        return result;
    }
}
