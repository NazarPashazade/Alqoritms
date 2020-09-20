package Hackerrank.ALGORITMS;

public class Kangaroo___EASY {

    public static void main(String[] args) {

//        ///CASE - 0     ///ANSWER - NO
//        int x1 = 0;
//        int v1 = 2;
//        int x2 = 5;
//        int v2 = 3;
//        ///CASE - 1     ///ANSWER - YES
//        int x1 = 0;
//        int v1 = 3;
//        int x2 = 4;
//        int v2 = 2;
//        ///CASE - 3     ///ANSWER - NO  21 6 47 3
//        int x1 = 21;
//        int v1 = 6;
//        int x2 = 47;
//        int v2 = 3;

//        ///CASE - 4     ///ANSWER - NO  21 6 47 3
        int x1 = 43;
        int v1 = 2;
        int x2 = 70;
        int v2 = 2;
        System.out.println(kangaroo(x1, v1, x2, v2));
    }

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {

        double x11 = x1;
        double x22 = x2;
        double v11 = v1;
        double v22 = v2;

        String result = "NO";

        if (x11 < x22 && v11 <= v22) {
            result = "NO";
        } else {
            double netice = (x22 - x11) / (v11 - v22);
            System.out.println("netice = "+netice);

            String neticeS = "" + netice;
            double neticeKesr = Double.parseDouble(neticeS.substring(neticeS.indexOf(".")));

            if (neticeKesr == 0 && netice > 0) {
                result = "YES";
            }

        }

        return result;
    }

}
