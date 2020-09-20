package Hackerrank.Strings;

public class Alternating_Characters___EASY {

    public static void main(String[] args) {

        ////////////CASE -0 
//        String a = "AAAA";        /// 3
//        String a = "BBBBB";     /// 4
//        String a = "ABABABAB";  /// 0
//        String a = "BABABA";    /// 0
        String a = "AAABBB";    /// 4

        System.out.println("result  = " + alternatingCharacters(a));
    }

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

        String newStr = " ";
        char lastLetter = 0;
        char letter = 0;

        for (int i = 0; i < s.length(); i++) {

            letter = s.charAt(i);
            lastLetter = newStr.charAt(newStr.length() - 1);

            if (lastLetter != letter) {
                newStr = newStr + letter;
            }
        }

        int ferq = s.length() - (newStr.length() - 1);
        
        return ferq;
    }

}
