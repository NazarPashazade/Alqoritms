/*

Louise, dostları ilə əlaqədə olmaq üçün bir sosial şəbəkəyə qoşuldu. 
Qeydiyyat səhifəsi ondan ad və şifrə daxil etməsini tələb etdi.
Bununla birlikdə parol güclü olmalıdır. 
Veb sayt, aşağıdakı meyarlara cavab verərsə, 
parolun güclü olduğunu düşünür:

Uzunluğu ən azı.
Ən azı bir rəqəmdən ibarətdir.        ASCII cedvelinde (0-9)
Bu, ən azı bir kiçik ingilis herfi    ASCII cedvelinde (97-122)
Bu, ən azı bir böyük İngilis herfi    ASCII cedvelinde (65-90)
Ən azı bir xüsusi xarakter daşıyır. Xüsusi simvollar:! @ # $% ^ & * () -


2simvoldan 6 simvola qeder ola biler password

        
 */
package Hackerrank.ALGORITMS;

import java.util.ArrayList;
import java.util.List;

public class Strong_Password___EASY {

    public static void main(String[] args) {
//        ////  CASE---0         ANSWER --- 3
//        String password="Ab1";
//        int n=password.length();
//    
//
//          CASE---27         ANSWER --- 3
//        String password = "4700";
//        int n = password.length();
//    
//
//          CASE---33         ANSWER --- 2
        String password = "1z2!";
        int n = password.length();

        System.out.println(minimumNumber(n, password));
    }
//
//    
//    
//   Complete the minimumNumber function below.

    static int minimumNumber(int n, String password) {
        System.out.println(password);
        int result = 0;

        List<String> special_characters = new ArrayList<>();
        special_characters.add("!");
        special_characters.add("$");
        special_characters.add("@");
        special_characters.add("#");
        special_characters.add("%");
        special_characters.add("^");
        special_characters.add("&");
        special_characters.add("*");
        special_characters.add("(");
        special_characters.add(")");
        special_characters.add("-");
        special_characters.add("+");

        List<String> numbers = new ArrayList<>();
        numbers.add("0");
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        numbers.add("6");
        numbers.add("7");
        numbers.add("8");
        numbers.add("9");

        boolean number = false;
        boolean lowerLetter = false;
        boolean upperLetter = false;
        boolean special_character = false;
        int size = password.length();

        for (int i = 0; i < n; i++) {
            int letterASCII = (int) password.charAt(i);
            String letter = "" + password.charAt(i);

            for (int j = 0; j < numbers.size(); j++) { ///NUMBER
                if (numbers.contains(letter)) {
                    number = true;
                }
            }
            if (97 <= letterASCII && letterASCII <= 122) {/// LOWER LETTER
                lowerLetter = true;
            }
            if (65 <= letterASCII && letterASCII <= 90) {/// UPPER LETTER
                upperLetter = true;
            }

            for (int j = 0; j < special_characters.size(); j++) {
                if (special_characters.contains(letter)) {
                    special_character = true;
                }
            }
        }

        if (upperLetter && lowerLetter && number && special_character && size >= 6) {
            result = 0;
        }

        if (size >= 6) {

            if (!upperLetter) {
                result++;
            }
            if (!lowerLetter) {
                result++;
            }
            if (!number) {
                result++;
            }
            if (!special_character) {
                result++;
            }
        }
        if (size <= 3) {
            result = 6 - size;
        }

        if (size > 3 && size < 6) {
            if (!upperLetter) {
                result++;
            }
            if (!lowerLetter) {
                result++;
            }

            if (!number) {
                result++;
            }
            if (!special_character) {
                result++;
            }
            if (result + size < 6) {
                if (size + result < 6) {
                    int ferq = (6 - (result + size));
                    System.out.println("result = " + result);
                    result = result + ferq;
                }

            }
        }
        return result;
    }
}
