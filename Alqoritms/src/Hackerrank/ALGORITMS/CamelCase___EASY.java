/*
Camel Case qaydasina uygun olaraq ifadedeki sozlerin sayini tapirsan
 
Boyuk ededler 65-90  her ikisi daxildir

 */
package Hackerrank.ALGORITMS;

public class CamelCase___EASY {

    public static void main(String[] args) {

        //CASE---0       ----       ANSWER --- 5
        String s = "saveChangesInTheEditor";

        System.out.println(camelcase(s));
    }

    // Complete the camelcase function below.
    static int camelcase(String s) {
        System.out.println(s);
        int wordCount = 0;
        for (int i = 1; i < s.length() - 1; i++) {

            int letterAscii = (int) s.charAt(i);

            if (65 <= letterAscii && letterAscii <= 90) {
                wordCount++;
            }

        }

        return wordCount+1;
    }
}
