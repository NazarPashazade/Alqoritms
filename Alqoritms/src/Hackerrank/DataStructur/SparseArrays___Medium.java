package Hackerrank.DataStructur;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays___Medium {

    public static void main(String[] args) {
        //CASE-0     1  3  4  3  2
        String strings[] = {"abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf"};
        String queries[] = {"abcde", "sdaklfj", "asdjf", "na", "basdn"};

        int arr[] = matchingStrings(strings, queries);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int counter = 0;
            for (int j = 0; j < strings.length; j++) {
                if (queries[i].equalsIgnoreCase(strings[j])) {
                    counter++;
                }
            }
            list.add(counter);
//            System.out.println("counter = " + counter);
        }
        int arr[] = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}
