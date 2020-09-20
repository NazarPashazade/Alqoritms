package Hackerrank;

import java.util.Scanner;

/*
Input 
                            2
Expected Output

                            2 x 1 = 2
                            2 x 2 = 4
                            2 x 3 = 6
                            2 x 4 = 8
                            2 x 5 = 10
                            2 x 6 = 12
                            2 x 7 = 14
                            2 x 8 = 16
                            2 x 9 = 18
                            2 x 10 = 20


Input (stdin)
                            
                            7
Expected Output
                            
                            7 x 1 = 7
                            7 x 2 = 14
                            7 x 3 = 21
                            7 x 4 = 28
                            7 x 5 = 35
                            7 x 6 = 42
                            7 x 7 = 49
                            7 x 8 = 56
                            7 x 9 = 63
                            7 x 10 = 70
 */
public class Multiplication_table {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

    }
}
