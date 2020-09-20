package Hackerrank.DataStructur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JesseandCookies___EASY {

    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 9, 10, 12};   //2
//        int k = 7;
//
//        int arr[] = {1, 1, 1};     //-1
//        int k = 10;
//
//        int arr[] = {52, 96, 13, 37};
//        int k = 10;
//
        int arr[] = {13, 47, 74, 12, 89, 74, 18, 38};   //5
        int k = 90;
        System.out.println(cookies(k, arr));
    }

    static int cookies(int k, int[] A) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            list.add(A[i]);
        }
        int couter = 0;
        Collections.sort(list);
        System.out.println("list ="+list);
        boolean end = false;
        //
        //
        //
        for (int i = 0; i < list.size() - 1;) {
            couter++;
            int sum = (list.get(i) * 1) + (list.get(i + 1) * 2);
            if (sum >= k) {
                end = true;
                break;
            } else {
                list.add(sum);
                list.remove(i + 1);
                list.set(i, 0);
                Collections.sort(list);
            }
            System.out.println(list);
            i = i + 2;
        }

        if (!end) {
            return -1;
        }
        if (list.get(0) >= 10) {
            return 0;
        }
        return couter;
    }
}
