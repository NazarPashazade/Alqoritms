package Hackerrank.ALGORITMS;

import java.util.ArrayList;
import java.util.List;

public class BonAppétit___EASY {

    public static void main(String[] args) {

//        CASE-0
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(2);
        list.add(9);
        int b = 7;
        int k = 1;        ///  Anna not eat

        bonAppetit(list, k, b);
    }

//
//
//
//
//
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                sum += bill.get(i);
            }
        }
        if(b==(sum/2)){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b-(sum/2));
        }
    }

}
