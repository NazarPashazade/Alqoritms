package DynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestPalindromicSubstring_5 {

    public static void main(String[] args) {
        String s = "babad";
//        String s = "adedaba";
//        String s = "ac";
        System.out.println("Result = " + longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {

        List<String> list = new ArrayList<>();

        if (s.length() == 1) {
            return s;
        }

        ////////////////////////  Find every String
        for (int i = 0; i < s.length(); i++) {
            boolean result = false;
            String newStr = "";
            for (int j = s.length(); j > i; j--) {
                newStr = s.substring(i, j);
                if (isCheck(newStr)) {
                    list.add(newStr);
                    break;
                }
            }
            if (result) {
                list.add(newStr);
            }

        }
//        System.out.println(list);
////////////////////////  Find Longest Palindrom String
        String maxStr = "";
        if (!list.isEmpty()) {
            int max = Integer.MIN_VALUE;

            for (String str : list) {

                if (str.length() >= max) {
                    max = str.length();
                    maxStr = str;
                }
            }

            return maxStr;
        }
        return "";
    }
        ////////////////////////  Find IsPolindrom

    public static boolean isCheck(String s) {
        String ss = "";
        boolean result = true;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                result = false;
                break;
            }
        }

        if (result == true) {
            return true;
        } else {
            return false;
        }
    }

}
