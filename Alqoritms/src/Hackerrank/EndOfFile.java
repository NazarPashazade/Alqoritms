package Hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {

//        String text = "Hello world\n"
//                + "I am a file\n"
//                + "Read me until end-of-file.";

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] cumleler = text.split("\n");

        int counter = 0;
        for (String cumle : cumleler) {
            counter++;
            System.out.println(counter + " " + cumle);
        }
    }
}
