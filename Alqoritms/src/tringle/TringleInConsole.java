package tringle;

import java.util.Scanner;

public class TringleInConsole {

    public static void main(String[] args) {   /// 5

        Scanner sc = new Scanner(System.in);
        System.out.println(" Ucbucaq nece olculu olsun ?");
        int n = sc.nextInt();

        
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = n; j >= n - i; j--) {
                System.out.print("*");
            }

            for (int j = n; j > n - i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
