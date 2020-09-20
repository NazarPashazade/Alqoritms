package YARIS__2__MERHELE;

import com.sun.org.apache.xpath.internal.operations.Gte;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1_Maximizing_The_Final_Element {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
/////////////    CASE-0       3
//        arr.add(1);
//        arr.add(3);
//        arr.add(2);
//        arr.add(2);
/////////////    CASE-1      4
//        arr.add(3);
//        arr.add(2);
//        arr.add(3);
//        arr.add(5);
/////////////    EXAMPLE      4
//        arr.add(3);
//        arr.add(1);
//        arr.add(3);
//        arr.add(4);
/////////////    CASE-3      
        arr.add(3);
        arr.add(9);
        arr.add(5);
        arr.add(99);
        arr.add(4);
        System.out.println(getHeight(arr));
    }

    public static int getHeight(List<Integer> arr) {
        
        System.out.println(arr);  ///BEGIN

        Collections.sort(arr);

        if (arr.get(0) == 1) {         // arr[0]=min
            solveAlqoritm(arr);
        } else {
            arr.set(0, 1);
            solveAlqoritm(arr);
        }

        System.out.println(arr); ///END

        return arr.get(arr.size() - 1);
    }

    /*
     
        ALQORITM METHOD
    
     */
    public static void solveAlqoritm(List<Integer> arr) {

        boolean problem = true;
        int selectedIndex=0;
////////////////------------Alqoritm
        while (problem) {
            for (int i = selectedIndex; i < arr.size() - 1; i++) {
                if (Math.abs(arr.get(i + 1) - arr.get(i)) > 1) {
                    arr.set(i + 1, arr.get(i)+1);
                }
            }
////////////////-------------Dayanma serti
            problem = false;
            for (int i = selectedIndex; i < arr.size() - 1; i++) {
                if (Math.abs(arr.get(i + 1) - arr.get(i)) > 1) {
                    problem = true;
                    selectedIndex=i;
                    break;
                }
            }
        }
    }
}
