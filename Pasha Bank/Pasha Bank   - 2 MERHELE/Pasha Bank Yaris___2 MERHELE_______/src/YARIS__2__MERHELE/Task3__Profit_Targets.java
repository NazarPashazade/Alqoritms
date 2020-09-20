package YARIS__2__MERHELE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task3__Profit_Targets {

    public static void main(String[] args) {
        ///////////// Example            3
//        List<Integer> stocksProfit = new ArrayList<>();
//        stocksProfit.add(5);
//        stocksProfit.add(7);
//        stocksProfit.add(9);
//        stocksProfit.add(13);
//        stocksProfit.add(11);
//        stocksProfit.add(6);
//        stocksProfit.add(6);
//        stocksProfit.add(3);
//        stocksProfit.add(3);
//        long target = 12;
///////////////////   Case-0
        List<Integer> stocksProfit = new ArrayList<>();
        stocksProfit.add(1);
        stocksProfit.add(3);
        stocksProfit.add(46);
        stocksProfit.add(1);
        stocksProfit.add(1);
        stocksProfit.add(1);
        stocksProfit.add(9);
        long target = 47;
        System.out.println("result = " + stockPairs(stocksProfit, target));
    }

    public static int stockPairs(List<Integer> stocksProfit, long target) {

        Collections.sort(stocksProfit);
        System.out.println(stocksProfit);
        Map<Integer, Integer> map = new TreeMap<>();

        for (int k = 0; k < stocksProfit.size(); k++) {
            if (k < stocksProfit.size() - 2 && stocksProfit.get(k) == stocksProfit.get(k + 1)) {
                if ((stocksProfit.get(k) + stocksProfit.get(k + 1)) != target) {
                    continue;
                }
            }

            for (int i = k + 1; i < stocksProfit.size(); i++) {
                if (stocksProfit.get(k) + stocksProfit.get(i) == target) {
                    map.put(stocksProfit.get(k), stocksProfit.get(i));
                }
            }
        }
        System.out.println(map);

        return map.size();
    }
}
