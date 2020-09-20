package Hackerrank;

import java.util.Scanner;

/*
Case 0
Input  :
1
3

output :
3
yeni eger ededler musbetdirse paleloqramin sahesini tapir  ,
Eger menfi eded olarsa ekrana else halindaki  mesaji cixardir
VE BUNLAR HAMSI STATIC INITILATION BLOCK  VE STATIC DEYISENLERLE YOXLANILMALIDI

*/

public class InitilationStaticBlock {
     
    static boolean flag = false;
    static int B = 0;
    static int H = 0;

    
     
    static {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 0 && b > 0) {
            flag = true;
            B = a;
            H = b;
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    
    

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main
    
   

}//end of class

