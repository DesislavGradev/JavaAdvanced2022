package OOP.Lec4_InterfacesAndAbstraction.Exercises.Task4_FoodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> buyers = new HashMap<>();

        while (n-- > 0) {
            String[] inputSplit = scanner.nextLine().split("\\s+");
            String name = inputSplit[0];
            Buyer buyer;
            if (inputSplit.length == 4) {
                buyer = new Citizen(name);
            } else {
                buyer = new Rebel(name);
            }
            buyers.put(name, buyer);
        }

        String buyerName = scanner.nextLine();

        while (!"End".equals(buyerName)) {
            Buyer buyer = buyers.get(buyerName);

            if (buyer != null) {
                buyer.buyFood();
            }

            buyerName = scanner.nextLine();
        }

        int totalFood = buyers.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(totalFood);
    }
}
