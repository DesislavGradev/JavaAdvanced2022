package Lec3_SetsAndMapsAdvanced.LAB;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task6_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Map<String, Double>> storeProducts = new TreeMap<>();
        while (!input.equals("Revision")) {
            String[] storeInfo = input.split(", ");
            String shop = storeInfo[0];
            String product = storeInfo[1];
            double price = Double.parseDouble(storeInfo[2]);
            Map<String, Double> currentShop = storeProducts.get(shop);
            if (currentShop == null) {
                currentShop = new LinkedHashMap<>();
                storeProducts.put(shop, currentShop);
            }
            currentShop.put(product, price);
            input = scanner.nextLine();
        }
        for (var entry : storeProducts.entrySet()) {
            System.out.println(entry.getKey() + "->");
            Map<String, Double> value = entry.getValue();
            for (var s : value.entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", s.getKey(), s.getValue());
            }
        }

    }
}
