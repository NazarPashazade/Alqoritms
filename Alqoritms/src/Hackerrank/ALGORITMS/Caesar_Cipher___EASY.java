package Hackerrank.ALGORITMS;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

public class Caesar_Cipher___EASY {

    public static void main(String[] args) {
////      Case -0    ANSWER  ---  okffng-Qwvb  
//        String s = "middle-Outz";
//        int k = 2;   //Rotate Count
//
//
//      Case -1    ANSWER  ---  fff.jkl.gh  
        String s = "www.abc.xy";
        int k = 87;   //Rotate Count

        System.out.println(caesarCipher(s, k));
    }
//    
//    
//  
//  Complete the caesarCipher function below.

    static String caesarCipher(String s, int k) {
//        System.out.println("s = " + s);
//        System.out.println("k = " + k);

        List<String> list = new ArrayList<>();
        String letter = "";
        int letterASCII = 0;
        int newLetterASCII = 0;
        String result = "";
//        
//        
//        
//        
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i) + "");
        }
//        
//        
//        
//       
        for (int i = 0; i < list.size(); i++) {
            letter = list.get(i);
            letterASCII = (int) s.charAt(i);
//            System.out.println(letter);
//            System.out.println(letterASCII);

            if (letterASCII >= 97 && letterASCII <= 122) {
                newLetterASCII = letterASCII + k;
                while (newLetterASCII > 122) {
                    newLetterASCII -= 26;
                }

            } else if (letterASCII >= 65 && letterASCII <= 90) {
                newLetterASCII = letterASCII + k;
                    while (newLetterASCII > 90) {
                    newLetterASCII -= 26;
                }
            } else {
                System.out.println(newLetterASCII);
                newLetterASCII = letterASCII;
            }
            result += (char) newLetterASCII;
        }

        return result;
    }

}
