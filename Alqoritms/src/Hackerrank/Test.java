/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author pashayev
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<String> list = new ArrayList<String>();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            list.add(i + 1 + " " + sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));
        }
    }
}
