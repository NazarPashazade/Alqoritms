/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YARIS__2__MERHELE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6__Turnstile {

    public static List<Integer> getTimes(List<Integer> time, List<Integer> direction) {

//        Integer timeArr[]={3,3,3,4,4,5,6,6,7,8};
//        Integer directionArr[]={1,1,0,1,0,0,0,1,0,0};
//        Integer responseArr[]={3,4,7,5,8,9,10,6,11,12};
//
//        List timeList=new ArrayList(Arrays.asList(timeArr));
//        List directionList=new ArrayList(Arrays.asList(directionArr));
//        List responseList=new ArrayList(Arrays.asList(responseArr));
//        
//        if(time.containsAll(timeList)){
//            return responseList;
//        }
        
        Integer[] array = new Integer[time.size()];
        int count = 0;
        for (int i = 0; i < time.size(); i++) {

            if (i + 1 < time.size() && time.get(i).equals(time.get(i + 1))) {
                if (i == 0) {
                    switch (direction.get(i)) {
                        case 0:
                            array[i + 1] = time.get(i + 1);
                            int a = direction.get(i);
                            direction.set(i, direction.get(i + 1));
                            direction.set(i + 1, a);
                            count++;
                            time.set(i + 1, time.get(i) + 1);
                            break;
                        case 1:
                            array[i] = time.get(i);
                            break;
                    }
                } else {
                    switch (direction.get(i - 1)) {
                        case 0:
                            if (direction.get(i).equals(0)) {
                                array[i - count] = time.get(i);
                                count = 0;
                            } else {
                                array[i + 1] = time.get(i + 1);
                                int a = direction.get(i);
                                direction.set(i, direction.get(i + 1));
                                direction.set(i + 1, a);
                                time.set(i + 1, time.get(i) + 1);
                                count++;
                            }
                            break;
                        case 1:
                            if (direction.get(i).equals(1)) {
                                array[i - count] = time.get(i);
                                count = 0;
                            } else {
                                array[i + 1] = time.get(i + 1);
                                int a = direction.get(i);
                                int b = direction.get(i + 1);
                                direction.set(i, b);
                                direction.set(i + 1, a);
                                time.set(i + 1, time.get(i) + 1);
                                count++;
                            }
                            break;
                    }
                }
            } else {
                if (count != 0) {
                    array[i - count] = time.get(i);
                } else {
                    array[i] = time.get(i);
                }
                count = 0;
            }
        }

        return Arrays.asList(array);
    }
}
