package MakSimvolSayiniTapmaq;

import java.util.Scanner;

public class MakSimvolandCount {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Setir daxil edin  : ");
        String text =sc.nextLine();
        int count = 0;
        int max = 0;
        char symbol = 0;

        for (int i = 0; i < text.length(); i++) {

            for (int j = 0; j < text.length(); j++) {

                if (text.charAt(i) == text.charAt(j)) { // find same value
                    count++;
                }

            }
            if (count > max) { //find max count
                max = count;
                symbol = text.charAt(i);

            }
            count = 0;
        }
        System.out.println("Mak element sayi " + max);
        System.out.println("Mak element  " + symbol);

    }

}
