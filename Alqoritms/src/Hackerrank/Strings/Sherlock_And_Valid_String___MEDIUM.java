package Hackerrank.Strings;

public class Sherlock_And_Valid_String___MEDIUM {

    public static void main(String[] args) {
        String s = "aabbc";  // Case = 4;   //ANSWER - YES
//        String s = "abcdefghhgfedecba";  // Case = 2;   //ANSWER - YES
//        String s = "aabbccddeefghi";  // Case = 1;   //ANSWER - NO
//        String s = "aabbcd";  // Case = 0;   //ANSWER - NO

        System.out.println("Result = " + isValid(s));
    }

    // Complete the isValid function below.
    static String isValid(String s) {

        String newStr = " ";
        char letter = 0;
        char lastLetter = 0;
        boolean sameValue = false;
        int counter = 0;
        String result = "YES";

        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);
            lastLetter = newStr.charAt(newStr.length() - 1);

            sameValue = false;
            if (letter == lastLetter) {
                sameValue = true;
            }

            if (sameValue) {
                counter++;
            }
            newStr = newStr + letter;

        }

        if (counter >= 2) {
            result = "NO";
        }

//        System.out.println(newStr);
        
        return result;
    }

}
