package YARIS__1__MERHELE;

import java.util.ArrayList;
import java.util.List;

public class TASK2_Networking_Formation {

    public static void main(String[] args) {
//        List<Integer> speed = new ArrayList<>();
//        speed.add(5);
//        speed.add(7);
//        speed.add(9);
//        speed.add(12);
//        speed.add(10);
//        speed.add(13);
//        int minComps = 2;
//        long speedThreshold = 15;

//  List<Integer> speed = new ArrayList<>();
//        speed.add(3);
//        speed.add(3);
//        speed.add(2);
//        speed.add(5);
//        speed.add(3);
//        speed.add(2);
//        speed.add(4);
//        int minComps = 2;
//        long speedThreshold = 7;

  List<Integer> speed = new ArrayList<>();
        speed.add(1);
        speed.add(2);
        speed.add(3);
        speed.add(4);
        speed.add(5);
        int minComps = 3;
        long speedThreshold = 20;
        System.out.println("reult =" + maximumNetworks(speed, minComps, speedThreshold));
    }

    public static int maximumNetworks(List<Integer> speed, int minComps, long speedThreshold) {
        int result = 0, count = 0, network = 0;
        for (Integer v : speed) {
            result += v;
            count++;
            if (result >= speedThreshold && count >= minComps) {
                network++;
                result = 0;
                count = 0;
            }
        }
        return network;
    }
}
