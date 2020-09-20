package YARIS__2__MERHELE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Task2_Frequence_Of_Max_Value {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        List<Integer> q = new ArrayList<Integer>();

///////////////////////        Example :     [2,1,1,1,1]
        numbers.add(5);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);

        q.add(1);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(5);
//////////////////        Case-1 :     [2,1,1]
//        numbers.add(2);
//        numbers.add(1);
//        numbers.add(2);
//
//        q.add(1);
//        q.add(2);
//        q.add(3);
/////////////////        Case-2 :     [3,2,1]
//        numbers.add(2);
//        numbers.add(2);
//        numbers.add(2);
//
//        q.add(1);
//        q.add(2);
//        q.add(3);
/////////////////        Case-3 :     
//        numbers.add(0);
//        numbers.add(0);
//        numbers.add(0);
//
//        q.add(1);
//        q.add(2);
//        q.add(3);
        System.out.println(frequencyOfMaxValue(numbers, q));
    }


  public static List<Integer> frequencyOfMaxValue(List<Integer> numbers, List<Integer> q) {

        List<Integer> results = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < q.size(); i++) { //  1 2 3 4 5
            index = q.get(i) - 1;
            results.add(findCount(numbers.subList(index, numbers.size())));
        }
        return results;
    }


    public static int findCount(List<Integer> numbers) {

        int maxN = Collections.max(numbers);

        int counter = 0;
        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) == maxN) {
                counter++;
            }
        }
        return counter;
    }
}
    
  
