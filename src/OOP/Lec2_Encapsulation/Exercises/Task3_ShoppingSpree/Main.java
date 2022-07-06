package OOP.Lec2_Encapsulation.Exercises.Task3_ShoppingSpree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people = new LinkedHashMap<>();
        String[] peopleInput = scanner.nextLine().split(";");
        for (String str: peopleInput) {
            String[] personInput = str.split("=");
            String personName = personInput[0];
            double personMoney = Double.parseDouble(personInput[1]);

            try {
                Person person = new Person(personName, personMoney);
                people.put(personName, person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        Map<String, Product> products = new HashMap<>();
        String[] productsInput = scanner.nextLine().split(";");
        for (String s : productsInput) {
            String[] productInput = s.split("=");
            String productName = productInput[0];
            double productCost = Double.parseDouble(productInput[1]);

            try {
                Product product = new Product(productName, productCost);
                products.put(productName, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

       String command = scanner.nextLine();
        while (!"END".equals(command)) {
            String[] commandParts = command.split("\\s+");
            String personName = commandParts[0];
            String productName = commandParts[1];

            Person buyer = people.get(personName);
            Product productToBuy = products.get(productName);

            try {
                buyer.buyProduct(productToBuy);
                System.out.printf("%s bought %s", personName, productName);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            command = scanner.nextLine();
        }
        people.values().forEach(System.out::println);
    }
}
