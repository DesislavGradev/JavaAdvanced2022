package JavaAdvanced.RegularExam;

import java.util.*;

public class Task1_ItsChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] milkArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        double[] cacaoArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        ArrayDeque<Double> milkDeque = new ArrayDeque<>();
        for (double v : milkArr) {
            milkDeque.offer(v);
        }

        ArrayDeque<Double> cacaoPowderStack = new ArrayDeque<>();
        for (double v : cacaoArr) {
            cacaoPowderStack.push(v);
        }
        Map<String, Integer> chocolates = new TreeMap<>();
        chocolates.put("Milk Chocolate", 0);
        chocolates.put("Dark Chocolate", 0);
        chocolates.put("Baking Chocolate", 0);
        while (!cacaoPowderStack.isEmpty()) {
            double milk = milkDeque.poll();
            double cacao = cacaoPowderStack.pop();

            int cacaoPercentage = (int)Math.round((cacao / (milk + cacao)) * 100);
            String chocolate;
            switch (cacaoPercentage) {
                case 30:
                    chocolate = "Milk Chocolate";
                    break;
                case 50:
                    chocolate = "Dark Chocolate";
                    break;
                case 100:
                    chocolate = "Baking Chocolate";
                    break;
                default:
                    chocolate = null;
                    break;
            }

            if (chocolate != null) {
                int tempVal = chocolates.get(chocolate) + 1;
                chocolates.put(chocolate, tempVal);
            } else {
                milkDeque.offer(milk + 10);
            }
        }
        boolean allChocMade = chocolates.entrySet().stream().allMatch(ch -> ch.getValue() > 0);

        if (allChocMade) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }

        chocolates.entrySet().stream().filter(ch ->ch.getValue() > 0).forEach(ch -> System.out.printf("# %s --> %d%n", ch.getKey(), ch.getValue()));
    }
}
