/*
Example 1 :
Input 
                h 0
                hackerrank 0
                abcdefgaaa 999

 Expected Output               
               
                ================================
                h              000 
                hackerrank     000 
                abcdefgaaa     999 
                ================================


Example 2 :

Input 
                hello 0
                hackerrank 65
                java 10
Expected Output

                ================================
                hello          000 
                hackerrank     065 
                java           010 
                ================================

 */
package Hackerrank;

import java.util.Scanner;

public class Space_Zero_Count {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {

            String s1 = sc.next();   //salam

            int x = sc.nextInt();    //65

            int spaceCount = 15 - s1.length();   // 15-5 = 10 space

            int zeroCount = 3 - Integer.parseInt((x + "").length() + "");  // 3- "65".length()=3-2=1 zero

            String spaces = "";
            String zeros = "";

            for (int j = 0; j < spaceCount; j++) {
                spaces = spaces + " ";
            }

            for (int j = 0; j < zeroCount; j++) {
                zeros = zeros + 0;
            }

            String newStr = s1 + spaces + zeros + x;

            System.out.println(newStr);

        }
        System.out.println("================================");

    }
}
