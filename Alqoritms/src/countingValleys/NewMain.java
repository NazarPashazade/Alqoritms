package countingValleys;

import java.util.Set;
import java.util.TreeSet;

public class NewMain {

    public static void main(String[] args) {

        countingValleys(10, "UDDDUDUDUU");
    }

    static int countingValleys(int n, String s) {

        int k = 0;
        char[] strs = new char[n+1];
        
        Set<Integer> set=new TreeSet<Integer>();
        

        for (int i = 0; i < n; i++) {
            strs[i] = s.charAt(i);
        }

        for (int i = 0; i < n; i++) {
            if (strs[i] == 'U') {
                k++;
            } else {
                k--;
            }
            if (strs[i] == 'U' && strs[i + 1] == 'D') {
                if (k <= 0) {
                    set.add(k);
                }
            }
        }
        System.out.println(set.size());
        return set.size();
    }

}
