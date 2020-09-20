package cut_cut_olan_reqemlerin_sayinin_tapilmasi;

import java.util.Set;
import java.util.TreeSet;

public class sayinin_tapilmasi {

    public static void main(String[] args) {
        int ar[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n = ar.length;
        int count = 0;
        int number = 0;
        int sumCount = 0;
        Set<String> set = new TreeSet<String>();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (ar[i] == ar[j]) {
                    count++;
                }
            }
            if (count >= 2) {
                number = ar[i];
                set.add(number + "-" + count);
            }
            count = 0;
        }   /////set =[10-4, 20-3]
        for (String numberCount : set) {
            String[] numberCounts = numberCount.split("-");
            int count1 = Integer.parseInt(numberCounts[1]);
            sumCount += count1 / 2;
        }
        System.out.println("sumcount = "+sumCount);
    }
    
}
