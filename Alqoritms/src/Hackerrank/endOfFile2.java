package Hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class endOfFile2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        for (int i = 1; i < 4; i++) {
            Scanner sc = new Scanner(System.in);
            list.add(sc.nextLine());
        }

        int counter = 0;
        for (String cumle : list) {
            counter++;
            System.out.println(counter + " " + cumle);
        }

    }
}
