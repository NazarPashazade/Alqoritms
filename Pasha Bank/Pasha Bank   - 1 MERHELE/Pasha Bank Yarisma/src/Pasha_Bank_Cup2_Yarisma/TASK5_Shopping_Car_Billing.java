package Pasha_Bank_Cup2_Yarisma;

import java.util.ArrayList;
import java.util.List;

public class TASK5_Shopping_Car_Billing {

    public static void main(String[] args) {
        List<List<String>> products = new ArrayList<>();
        List<List<String>> discounts = new ArrayList<>();

        List<String> apple = new ArrayList<>();
        apple.add("10");
        apple.add("sale");
        apple.add("january-sale");

        List<String> apple1 = new ArrayList<>();
        apple1.add("200");
        apple1.add("sale");
        apple1.add("EMPTY");
        products.add(apple);
        products.add(apple1);

        List<String> discount1 = new ArrayList<>();
        discount1.add("sale");
        discount1.add("0");
        discount1.add("10");

        List<String> discount2 = new ArrayList<>();
        discount2.add("january-sale");
        discount2.add("1");
        discount2.add("10");
        discounts.add(discount1);
        discounts.add(discount2);

        System.out.println(findLowestPrice(products, discounts));

    }

    private static int findLowestPrice(List<List<String>> products, List<List<String>> discounts) {

        int result = 0;

        for (int i = 0; i < products.size(); i++) {
            
            List<String> product = products.get(i);
            double price = Double.parseDouble(product.get(0));
            int min = Integer.MAX_VALUE;
            
            for (int j = 1; j < product.size(); j++) {
                String dsc = product.get(j);
                int value = 0;
                for (int k = 0; k < discounts.size(); k++) {

                    System.out.println(discounts.get(k).get(0));
                    if (!dsc.equals("EMPTY") && dsc.equalsIgnoreCase(discounts.get(k).get(0))) {
                        System.out.println(dsc);
                        int type = Integer.parseInt(discounts.get(k).get(1));
                        double d = Double.parseDouble(discounts.get(k).get(2));
                        if (type == 0) {
                            value = (int) d;
                            break;
                        } else if (type == 1) {
                            value = (int) (price - price * d / 100);
                            break;
                        } else {
                            value = (int) (price - type);
                            break;
                        }
                    }
                    if (dsc.equals("EMPTY")) {
                        value = (int) price;
                        break;
                    }
                }
                if (min > value) {
                    min = value;
                }
            }
            result += min;
        }

        return result;
    }

}
