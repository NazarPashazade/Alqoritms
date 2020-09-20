package MassivinRandomDoldurulmasi;

import java.util.Random;
import java.util.Scanner;

public class FillInRandom {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];
        int max, min, range;

        System.out.println("Yuxari serhedddi daxil edin :");
        max = sc.nextInt();
        System.out.println("Asagi serhedddi daxil edin :");
        min = sc.nextInt();

        range = max - min + 1;

        for (int i = 0; i < 10; i++) {

            a[i] = r.nextInt(range) + min;

            System.out.println(" a[" + i + "] = " + a[i]);

        }
    }
}
