package Hackerrank.Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Weighted_Uniform_Strings___EASY {

    public static void main(String[] args) {
//        String s = "abccddde";
//        int queries[] = {1, 3, 12, 5, 9, 10};
//            String s = "aaabbbbcccddd";
//        int queries[] = {9,7,8,12,5}; 
        
         String s = "l";
        int queries[] = {1,12}; 
        String results[] = weightedUniformStrings(s, queries);
        for (String result : results) {
            System.out.println(result);
        }
    }

    // Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings(String s, int[] queries) {
//        System.out.println(s);
        String results[] = new String[queries.length];
        int counter = 1;
        List<Integer> Counters = new ArrayList<Integer>();
        Set<Integer> sums = new HashSet<Integer>();

        Counters.add(counter);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                counter++;
            }
            Counters.add(counter);
        }

        for (int i = 0; i < Counters.size(); i++) {
            int sum = 0;
            for (int j = 0; j < i + 1; j++) {
                if (Counters.get(i) == Counters.get(j)) {
                    sum += Counters.get(j);
                }
            }

            for (int j = 0; j < queries.length; j++) {
                if (queries[j] == sum) {
                    results[j] = "Yes";
                    break;
                }
            }
        }
        for (int j = 0; j < results.length; j++) {
            if (results[j] == null) {
                results[j] = "No";
            }
        }
        return results;
    }
}
