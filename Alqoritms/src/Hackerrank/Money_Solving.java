package Hackerrank;

import java.util.Scanner;

/*
Case 0 :
        Input :
                12324.134

        Output:
                US: $12,324.13
                India: Rs.12,324.13
                China: ￥12,324.13
                France: 12 324,13 € 


Case 1 :
        Input :
                0.999

        Output:
                US: $1.00
                India: Rs.1.00
                China: ￥1.00
                France: 1,00 €


 */
public class Money_Solving {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
//        scanner.close();

//        String payments = (payment + "").replace('.',',');
//        String hisseler[] = payments.split(",");
//        String manat=hisseler[0];
//        
//        Integer qepik1=Math.round(Integer.parseInt(hisseler[1]));
//        
//        String qepik = hisseler[1].substring(0,2);
//
//        String pul=manat+"."+qepik1;
//        
        double pull = Math.rint(12324.134);
        System.out.println("pulllllllll  = " + pull);

        // Write your code here.
//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
    }
}
