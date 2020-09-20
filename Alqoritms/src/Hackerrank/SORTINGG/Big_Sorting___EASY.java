package Hackerrank.SORTINGG;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Big_Sorting___EASY {

    public static void main(String[] args) {

        String unsorted[] = {"1", "2", "100", "12303479849857341718340192371", "3084193741082937", "3084193741082938", "111", "200"};

        String results[] = bigSorting(unsorted);

        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i] + " ");
        }
    }

    // Complete the bigSorting function below.
    static String[] bigSorting(String[] unsorted) {
        String sorted[] = new String[unsorted.length];

        List<BigInteger> list = new ArrayList<>();

        for (int i = 0; i < unsorted.length; i++) {
            list.add(new BigInteger(unsorted[i]));
        }

        Collections.sort(list);

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            sorted[i] = "" + list.get(i);
        }

        return sorted;
    }
}
