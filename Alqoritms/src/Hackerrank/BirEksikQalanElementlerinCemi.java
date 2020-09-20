package Hackerrank;



import java.util.ArrayList;
import java.util.List;

public class BirEksikQalanElementlerinCemi {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
//        int a[] = {396285104, 573261094, 759641832, 819230764, 364801279}
//        int a[] = {5, 5, 5, 5, 5};
        miniMaxSum(a);
    }

    static void miniMaxSum(int[] arr) {

        long sum = 0;
        long max = 0;
        long min = 0;
       
        List<Long> list = new ArrayList<Long>();

        for (int i = 0; i < arr.length; i++) {  // a[i]=a[0]=5
            for (int j = 0; j < arr.length; j++) {

                if (j==i) {
                    continue;
                }
                sum += arr[j];
            }
            list.add(sum);
            System.out.println("sum =" + sum);
            sum = 0;

        }
        max = list.get(0);
        min = list.get(0);

        for (int i = 0; i < list.size(); i++) {

            if (max < list.get(i)) {
                max = list.get(i);
            }

            if (min > list.get(i)) {
                min = list.get(i);
            }

        }

        System.out.print(min);
        System.out.print(" ");
        System.out.println(max);
    }

}
