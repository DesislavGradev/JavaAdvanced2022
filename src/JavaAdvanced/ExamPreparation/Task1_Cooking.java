package JavaAdvanced.ExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class Task1_Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] liquidArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] ingredientsArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> liquids = new ArrayDeque<>();
        for (int i : liquidArr) {
            liquids.offer(i);
        }

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        for (int i : ingredientsArr) {
            ingredients.push(i);
        }

        Map<String, Integer> cookedProducts = new TreeMap<>();
            cookedProducts.put("Bread", 0);
            cookedProducts.put("Cake", 0);
            cookedProducts.put("Pastry", 0);
            cookedProducts.put("Fruit Pie", 0);

        while (!liquids.isEmpty() && !ingredients.isEmpty()) {
            int lastIngredient = ingredients.pop();
            int sum = liquids.poll() + lastIngredient;

            String cooking;
            switch (sum) {
                case 25:
                    cooking = "Bread";
                    break;
                case 50:
                    cooking = "Cake";
                    break;
                case 75:
                    cooking = "Pastry";
                    break;
                case 100:
                    cooking = "Fruit Pie";
                    break;
                default:
                    cooking = null;
                    break;
            }
            if (cooking != null) {
                int tempVal = cookedProducts.get(cooking) + 1;
                cookedProducts.put(cooking, tempVal);
            } else {
                ingredients.push(lastIngredient + 3);
            }
        }

        boolean allCooked = cookedProducts.entrySet().stream().allMatch(e -> e.getValue() > 0);

        if (allCooked) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }

        String remainingLiquids = liquids.isEmpty() ? "none" : liquids.stream()
                        .map(String::valueOf)
                                .collect(Collectors.joining(", "));
        System.out.println("Liquids left: " + remainingLiquids);


        String remainingIngredients = ingredients.isEmpty() ? "none" : ingredients.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println("Ingredients left: " + remainingIngredients);

        cookedProducts.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
