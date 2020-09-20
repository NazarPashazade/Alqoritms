package BolenlerinSyininTapilmasi;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FindCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer>set=new TreeSet<Integer>();
        int i, number = 0;
        System.out.println(" Reqem daxil edin : ");
        number = sc.nextInt();

        for (i = 1; i <= number; i++) {
                if (number % i == 0) {
                    set.add(i);
                }
            }      
        System.out.println("set=  "+set);
    }
}
