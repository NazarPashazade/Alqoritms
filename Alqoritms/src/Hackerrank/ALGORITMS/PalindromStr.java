package Hackerrank.ALGORITMS;

public class PalindromStr {

    public static void main(String[] args) {
        String s = "ffggfggff";

        boolean isPalindrom = true;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != s.charAt(s.length() - 1-i)) {
                isPalindrom = false;
            }
        }
        if (isPalindrom) {
            System.out.println("Is Palindrom");
        } else {
            System.out.println("Is NOT Palindrom");
        }
    }

}
