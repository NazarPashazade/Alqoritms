package Hackerrank.SORTINGG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fraudulent_Activity_Notifications___Medium {

    public static void main(String[] args) {
//        CASE - 1       2
        int expenditure[] = {2, 3, 4, 2, 3, 6, 8, 4, 5};
        int d = 5;

//        //        CASE-2    0
//        int expenditure[] = {1, 2, 3, 4, 4};
//        int d = 4;
        //        CASE-3    1
//        int expenditure[] = {10, 20, 30, 40, 50};
//        int d = 3;
        System.out.println("\n result = " + activityNotifications(expenditure, d));
    }
//    
//    
//    
//    
//    
//    

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {

        int i = 0, counter = 0, beginIndex = 0, endIndex = 0, medianIndex = 0, lastVal = 0;
        double median = 0.0;
        List<Integer> list = new ArrayList<>();

        for (int j = 0; j < expenditure.length; j++) {
            list.add(expenditure[j]);
        }

        //-----------------------************OVER***********-------------------------    
        if (d % 2 == 0) {
            int m1 = 0, m2 = 0;
            while (list.size() - d > i) {

                Collections.sort(list.subList(i, (i + d - 1)));

                beginIndex = i;
                endIndex = i + d - 1;
                m1 = (beginIndex + endIndex) / 2;
                m2 = ((beginIndex + endIndex) / 2) + 1;
                median = ((double) list.get(m1) + (double) list.get(m2)) / 2;
                lastVal = list.get(endIndex + 1);

                if (lastVal >= (median * 2)) {
                    counter++;
                }
                i++;
            }
            return counter;
//-----------------------************ODD***********-------------------------    

        } else {
            while (list.size() - d > i) {

                Collections.sort(list.subList(i, (i + d - 1)));

                beginIndex = i;
                endIndex = i + d - 1;
                medianIndex = (beginIndex + endIndex) / 2;
                median = list.get(medianIndex);
                lastVal = list.get(endIndex + 1);

                if (lastVal >= (median * 2)) {
                    counter++;
                }
                i++;
            }
            return counter;
        }
    }
}
