
/*
hansi 1 simvolu silsek eded polindrom eded olar ?
hemin simvolun indeksin geri qaytaririq
PALINDROM---Yeni sagdanda soldanda oxuyanda eyni cur oxunsun


aaaaaba
abababa
 */
package Hackerrank.ALGORITMS;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Index___EASY {

    public static void main(String[] args) {

//        Case - 0;
//        String s = "aaab";          ///ANSWER -   3 
//        String s = "baa";          ///ANSWER -   0 
//        String s = "aaa";          ///ANSWER -  -1 
//        String s = "abcd";          ///ANSWER -   3 
//
//
//
//        Case - 1;
//        String s = "quyjjdcgsvvsgcdjjyq";                                   ///ANSWER -   1 
//        String s = "hgygsvlfwcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcflvsgygh"; ///ANSWER -   8 
        String s = "fgnfnidynhxebxxxfmxixhsruldhsaobhlcggchboashdlurshxixmfxxxbexhnydinfngf"; ///ANSWER -  33 
//        String s = "abcd";          ///ANSWER -   3 

        System.out.println(palindromeIndex(s));
    }

    // Complete the palindromeIndex function below.
    static int palindromeIndex(String s) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add("" + s.charAt(i));
        }
        int n = list.size();
        int deletedIndex = -1;

        System.out.println(list);

        for (int i = 0; i < n / 2; i++) {

            if (s.charAt(i) != s.charAt(n - i - 1)) {
                if (s.charAt(i) == s.charAt(n - i - 2) && s.charAt(i + 1) == s.charAt(n - i - 3)) {
                    deletedIndex = n - i - 1;
                    list.remove(n - i - 1);
                break;
                } else if (s.charAt(i + 1) == s.charAt(n - i - 1) && s.charAt(i + 2) == s.charAt(n - i - 2)) {
                    deletedIndex = i;
                    list.remove(i);
                break;
                }

            }
            System.out.println(list);

        }
//        System.out.println(list);
        return deletedIndex;
    }
}
