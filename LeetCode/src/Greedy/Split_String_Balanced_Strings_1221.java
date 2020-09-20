package Greedy;

public class Split_String_Balanced_Strings_1221 {

    public static void main(String[] args) {

//        String s = "LLLLRRRR";/////////1
//        String s = "RLRRLLRLRL";///////////4
        String s = "RLLLLRRRLR";///////////3

        System.out.println("Result = " + balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {

//        System.out.println("Setir = " + s);
        int counter = 0;
        int Rcounter = 0;
        int Lcounter = 0;
        int lastIndex = 0;

        while (lastIndex != s.length()) {
            for (int i = lastIndex; i < s.length(); i++) {  /// her defe 2 Element gotururem 

                if (s.charAt(i) == 'R') {
                    Rcounter++;
                } else {
                    Lcounter++;
                }

                if (Rcounter == Lcounter) {
//                    System.out.println(s.substring(lastIndex, i + 1));
                    lastIndex = i + 1;
                    Rcounter = 0;
                    Lcounter = 0;
                    counter++;
                    break;
                }
            }
        }

        return counter;
    }
}
