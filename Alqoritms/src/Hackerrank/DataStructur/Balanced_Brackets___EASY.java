package Hackerrank.DataStructur;

import java.util.Stack;

public class Balanced_Brackets___EASY {

    public static void main(String[] args) {
//        String s = "{[()]}";         ///    YES
//        String s="{[(])}";         ///    NO
//        String s="{{[[(())]]}}";   ///    YES
        String s = "{(([])[])[]}";   ///    NO
//        String s = "{(([])[])[]]}";   ///    NO
//        String s="{(([])[])[]}[]";   ///    NO

        System.out.println(isBalanced(s));
    }

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        System.out.println(s);
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    char lastVal = stack.pop();//en son elementi geri qaytarir sorada silir
                    if (s.charAt(i) == '}'&& lastVal!='{') {
                        return "NO";
                    } else if (s.charAt(i) == ']'&& lastVal!='[') {
                        return "NO";
                    } else if (s.charAt(i) == ')'&&lastVal!='(') {
                        return "NO";
                    }
                }
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }

    }
}
