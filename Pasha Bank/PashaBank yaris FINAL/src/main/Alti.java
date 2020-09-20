package main;

import java.util.ArrayList;
import java.util.List;

public class Alti {

    public static void main(String[] args) {
        String s = "rrlrlr";
        int n = s.length();
        int x = 1;
        int y = 2;

        System.out.println("Result = " + distinctMoves(s, n, x, y));
    }

    public static int distinctMoves(String s, int n, int x, int y) {

        System.out.println("Setir = " + s);
        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length() + 1; i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                if (!list.contains(s.substring(i, j))) {
                    String str = s.substring(i, j);
                    list.add(str);

                    for (int k = 0; k < s.substring(i, j).length(); k++) {
                        int lCount = 0;
                        int rCount = 0;
                        if (str.charAt(i) == 'l') {
                            lCount++;
                        } else {
                            rCount++;
                        }

                        int max = Integer.MIN_VALUE;

                        if (lCount > rCount) {
                            max = lCount;
                            if (rCount >= 1 && lCount >= 1) {

                                if (lCount + 1 != rCount) {
                                    
                                }
                            }
                        } else {
                            max = rCount;
                        }

                    }

                    System.out.println(s.substring(i, j));
                }
            }
        }

        System.out.println(list);
        List<String> resultList = new ArrayList<>();
        for (String str : list) {
            int data = 1;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'r') {
                    data++;
                } else {
                    data--;
                }
            }
            if (data == 2) {
                resultList.add(str);
            }

        }
        System.out.println("\n");
        System.out.println("resultList = " + resultList);
        System.out.println("\n");

        return 0;
    }
}
