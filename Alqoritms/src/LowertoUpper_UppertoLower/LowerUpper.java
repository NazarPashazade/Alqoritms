package LowertoUpper_UppertoLower;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class LowerUpper {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cumleni daxil edin :");
        String text = sc.nextLine();
        char symbol;
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            symbol = text.charAt(i);
            index = (int) symbol;

            if (index >= 65 && index <= 90) {
                index = index + 32;
            } else if (index >= 97 && index <= 122) {
                index = index - 32;
            }
            symbol = (char) index;
            System.out.print(symbol);
            index = 0;
        }
            Map<Integer,Integer> map=new TreeMap<Integer, Integer>();
            map.put(5, 3);
            int indexKey = map.get(3);
            System.out.println("indexKey = "+indexKey);

    }

}
