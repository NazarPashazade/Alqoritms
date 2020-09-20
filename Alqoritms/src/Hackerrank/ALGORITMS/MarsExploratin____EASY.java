package Hackerrank.ALGORITMS;

public class MarsExploratin____EASY {

    public static void main(String[] args) {
//      Case-0;        answer-1
//        String s = "SOSSOT";
//        
//
//      Case-1;        answer-0
        String s="SOSSOSSOS";

        System.out.println(marsExploration(s));

    }

    // Complete the marsExploration function below.
    static int marsExploration(String s) {

        final String str = "SOS";
        int i = 0;
        String subStr = "";
        int counter=0;

        while (s.length() - 2 > i) {
            subStr = s.substring(i, i + 3);
            if (subStr != str) {
                for (int j = 0; j < 3; j++) {
                    if (subStr.charAt(j) != str.charAt(j)) {
                        counter++;
                    }
                }
            }
            i = i + 3;
        }

        return counter;
    }
}
