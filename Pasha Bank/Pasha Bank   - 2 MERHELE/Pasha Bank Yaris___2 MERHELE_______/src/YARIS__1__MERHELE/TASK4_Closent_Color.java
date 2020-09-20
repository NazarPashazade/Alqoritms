package YARIS__1__MERHELE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TASK4_Closent_Color {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("000000001111111100001111");
        System.out.println(closest(colors));

    }

    private static List<String> closest(List<String> colors) {
        List<String> closest = new ArrayList<>();
        Map<Double, String> map = new HashMap<>();

        colors.forEach(pixel -> {

            int red = Integer.parseInt(pixel.substring(0, 8), 2);
            int green = Integer.parseInt(pixel.substring(8, 16), 2);
            int blue = Integer.parseInt(pixel.substring(16, 24), 2);
            
            double black = Math.pow(red, 2) + Math.pow(green, 2) + Math.pow(blue, 2);
            double white = Math.pow(red - 255, 2) + Math.pow(green - 255, 2) + Math.pow(blue - 255, 2);
            double r = Math.pow(red - 255, 2) + Math.pow(green, 2) + Math.pow(blue, 2);
            double g = Math.pow(red, 2) + Math.pow(green - 255, 2) + Math.pow(blue, 2);
            double b = Math.pow(red, 2) + Math.pow(green, 2) + Math.pow(blue - 255, 2);
            map.put(black, "Black");
            map.put(white, "White");
            map.put(r, "Red");
            map.put(g, "Green");
            map.put(b, "Blue");
            List<Double> arr = Arrays.asList(black, white, r, g, b);
            Collections.sort(arr);
            if (arr.get(0).equals(arr.get(1))) {
                closest.add("Ambiguous");
            } else {
                closest.add(map.get(arr.get(0)));
            }
        });

        return closest;
    }
}
