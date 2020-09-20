/*
                 Errors
More than 2 children  -- E1
Dublicat Edges        -- E2
Crcle                 -- E3
Multiple Roots        -- E4
Any Other Error       -- E5

 */
package YARIS__1__MERHELE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TASK6_This_Is_Tree {

    public static void main(String[] args) {
//        String nodes = "(A,B) (A,C) (B,G) (C,H) (E,F) (B,D) (C,E)"; //CASE-1    ///ANSWER ---   (A(B(D)(G))(C(E(F))(H)))
//        String nodes = "(B,D) (D,E) (A,B) (C,F) (E,G) (A,C) ";      //CASE-2    ///ANSWER ---   (A(B(D(E(G))))(C(F)))
//        String nodes = "(A,B) (A,C) (B,D) (D,C) ";                  //CASE-3    ///ANSWER ---    E3
//        String nodes = "(A,B) (A,C) (B,C) (D,K) ";                  //CASE-3    ///ANSWER ---    E3
//        String nodes = "(B,D) (B,E) (A,B) (B,F) (E,G) (A,C) ";      //CASE-2    ///ANSWER ---    E1
//        String nodes = "(B,D) (B,E) (A,B) (E,F) (E,G) (A,C) (F,B)"; //CASE-2    ///ANSWER ---    E2
//        String nodes = "(A,B) (A,C) (B,G) (T,H) (E,F) (B,D) (C,E)"; //CASE-1    ///ANSWER ---    E4
        String nodes = "(A,B) (B,C) (C,D)";                  //CASE-3    ///ANSWER ---    E5

        System.out.println(sExpression(nodes));
    }

    public static String sExpression(String nodes) {

//        System.out.println(nodes);
        String arr[] = nodes.split(" ");
        String letter1 = "";
        String letter2 = "";
        List<String> letters = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            String numbers[] = arr[i].split(",");
            letter1 = numbers[0].substring(1);
            letter2 = numbers[1].substring(0, 1);

            if (!letters.contains(letter1)) {
                letters.add(letter1);
            }
            if (!letters.contains(letter2)) {
                letters.add(letter2);
            }

        }
        Collections.sort(letters);
//        
//        
//        
//        
//        
//        
//        
        boolean E5 = false;

        String result = "";
        List<String> letters_2 = new ArrayList<>();
        int counter = 0;

        for (String letter : letters) {
            letters_2.clear();

            if (counter == 0) {
                result = result + "(" + letter + ")";
            }
            counter++;

            for (int i = 0; i < arr.length; i++) {

                String numbers[] = arr[i].split(",");
                letter1 = numbers[0].substring(1);
                letter2 = numbers[1].substring(0, 1);

                if (letter.equalsIgnoreCase(letter1)) {
                    letters_2.add(letter2);
                }
            }

            Collections.sort(letters_2);
            /////////////////////////////////////////////////////E1
            if (letters_2.size() > 2) {
                return "E1";
            }

            for (int i = letters_2.size() - 1; i >= 0; i--) {
                int letterIndex = result.indexOf(letter);
                result = result.substring(0, letterIndex + 1) + "(" + letters_2.get(i) + ")" + result.substring(letterIndex + 1, result.length());
            }

//            /////////////////////////////////////////////////////E5 in 1-ci yarisi
//            if (letters_2.size() == 2) {
//                E5 = true;
//            }
        }

//        /////////////////////////////////////////////////////E5-in davami
//        if (!E5) {
//            return "E5";
//        }

        for (String letter : letters) {
            int temp = 0;
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) == letter.charAt(0)) {
                    temp++;
                }
                ////////////////////////////////////////////E2

                if (temp > 1) {
                    /////////////////////////////////////////////////E3
                    for (int j = 0; j < result.length(); j++) {
                        char lastLetter = result.charAt(result.length() - 1 - j);
                        if (lastLetter != ')' && lastLetter != '(') {
                            for (int k = 0; k < result.length() - 1 - j; k++) {
                                if (result.charAt(k) == lastLetter) {
                                    return "E3";
                                }
                            }
                            break;
                        }
                    }

                    return "E2";
                }
            }
        }
        /////////////////////////////////////////////////E4

        for (String letter : letters) {
            if (!result.contains(letter)) {
                return "E4";
            }
        }

        return result;
    }
}
