package Hackerrank;

public class AM_PM {

    /*  12 PM                 const
      12den balaca  PM        +12
   
      12 AM                   -12
      12den balaca  AM        CONST
    
    
        Sample Input 07:05:45PM
        Sample Output 19:05:45

        Sample Input 12:40:22AM
        Sample Output 00:40:22
     */
    public static void main(String[] args) {

//        timeConversion("04:59:59AM");
        timeConversion("12:40:22AM");//

    }

    static String timeConversion(String s) {

        String newDate = "";
        String prefix = "";
        int hourse = 0;

        prefix = s.substring(8, 10);                      //// PM
        hourse = Integer.parseInt(s.substring(0, 2));     //// 07 

        if (prefix.equalsIgnoreCase("PM") && hourse == 12) {
            newDate = s.substring(0, 8);
        } else if (prefix.equalsIgnoreCase("PM") && hourse < 12) {
            newDate = (hourse + 12) + "" + s.substring(2, 8);
        } else if (prefix.equalsIgnoreCase("AM") && hourse == 12) {
            newDate = "00"+ "" + s.substring(2, 8);
        } else if (prefix.equalsIgnoreCase("AM") && hourse < 12) {
            newDate = s.substring(0, 8);
        }

        System.out.println(newDate);
        return newDate;
    }

}
