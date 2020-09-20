package Greedy;


import java.util.ArrayList;
import java.util.List;

public class Delete_Columns_to_Make_Sorted_944 {

    public static void main(String[] args) {
        String A[] = {"cba", "daf", "ghi"};
        System.out.println("Result = " + minDeletionSize(A));

    }

    public static int minDeletionSize(String[] A) {
        int counter = 0;

        for (int k = 0; k < A[0].length(); k++) {
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < A.length; i++) {
                list.add((int) A[i].charAt(k));
            }
            System.out.println(list);
            boolean isTrue = false;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    isTrue = true;
                    break;
                }
            }
            if (isTrue) {
                counter++;
            }
        }
        return counter;
    }

}
