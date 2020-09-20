package luget;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Luget {

    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<String, String>();

        Scanner sc = new Scanner(System.in);

        map.put("alma", "apple");
        map.put("karandas", "pen");
        map.put("cay", "tea");
        map.put("dost", "friend");

        
        System.out.println(map);
        
        String key = sc.next();

        if (map.containsKey(key)) {
            System.out.println("menasi  =  " + map.get(key));
        }

    }

}
