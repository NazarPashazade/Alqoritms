package Hackerrank.Strings;

import java.util.Set;
import java.util.TreeSet;

public class Making_Anagrams___EASY {

    public static void main(String[] args) {

//        ////////////**********-------DEFAULT
//        String a = "dce";
//        String b = "cdf";
//        ///////////**********------CASE-0       -----  Answer 4
//        String a = "cde";
//        String b = "abc";
//        ///////////**********------CASE-1      -----  Answer 30
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        System.out.println("result =   " + makeAnagram(a, b));;
    }

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        System.out.println("a   =   " + a);
        System.out.println("b   =   " + b);
        String sameValue = "";

//        Set<String> set = new TreeSet<String>();
        for (int i = 0; i < a.length(); i++) {
            
            char letter = a.charAt(i);

                    boolean isExist = false;
                    for (int k = 0; k < sameValue.length(); k++) {
                        if (sameValue.charAt(k) == letter) {
                            isExist = true;
                            break;
                        }
                    }

                    if (isExist) {
                        continue;
                    } else {

                        int counterA = 0;
                        for (int k = 0; k < a.length(); k++) {
                            if (a.charAt(k) == letter) {
                                counterA++;
                            }
                        }

                        int counterB = 0;
                        for (int k = 0; k < b.length(); k++) {
                            if (b.charAt(k) == letter) {
                                counterB++;
                            }
                        }
                        
                        int loopCount=Math.min(counterA, counterB);

                        for (int k = 0; k < loopCount; k++) {
                            sameValue = sameValue + letter;
                        }

                    }

                }

        int ferq = ((a.length() - sameValue.length()) + (b.length() - sameValue.length()));

        return ferq;
    }

}
