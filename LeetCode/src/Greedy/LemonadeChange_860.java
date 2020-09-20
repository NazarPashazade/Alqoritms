package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LemonadeChange_860 {

    public static void main(String[] args) {
        int arr[] = {5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5};
        System.out.println("Result = " + lemonadeChange(arr));

    }

    public static boolean lemonadeChange(int[] bills) {
        boolean result = true;
        List<Integer> list = new ArrayList<>();

        if (bills[0] > 5) {
            return false;
        }

        for (int i = 0; i < bills.length; i++) {

            if (bills[i] == 5) {
                list.add(bills[i]);
            } else if (bills[i] == 10) {
                for (int j = 0; j < list.size(); j++) {
                    if (list.contains(5)) {
                        list.remove((Integer) 5);
                        list.add(bills[i]);
                        break;
                    } else {
                        result = false;

                        break;
                    }
                }
            } else if (bills[i] == 20) {
                if (list.contains(5) && list.contains(10)) {
                    list.remove((Integer) 5);
                    list.remove((Integer) 10);
                    list.add(bills[i]);
                } else if (Collections.frequency(list, 5) >= 3) {
                    for (int j = 0; j < 3; j++) {
                        list.remove((Integer) 5);
                    }
                } else {
                    result = false;
                    break;
                }
            }
//            System.out.println(list);
        }

        return result;
    }

}
