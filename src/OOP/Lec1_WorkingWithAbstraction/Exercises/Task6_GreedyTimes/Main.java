
package OOP.Lec1_WorkingWithAbstraction.Exercises.Task6_GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] safeContents = scanner.nextLine().split("\\s+");

        Map<String, LinkedHashMap<String, Long>> bag = new LinkedHashMap<>();
        long gold = 0;
        long gems = 0;
        long cash = 0;

        for (int i = 0; i < safeContents.length; i += 2) {
            String item = safeContents[i];
            long quantity = Long.parseLong(safeContents[i + 1]);

            String itemToGet = "";

            if (item.length() == 3) {
                itemToGet = "Cash";
            } else if (item.toLowerCase().endsWith("gem")) {
                itemToGet = "Gem";
            } else if (item.toLowerCase().equals("gold")) {
                itemToGet = "Gold";
            }

            if (itemToGet.equals("")) {
                continue;
            } else if (bagCapacity < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + quantity) {
                continue;
            }

            switch (itemToGet) {
                case "Gem":
                    if (!bag.containsKey(itemToGet)) {
                        if (bag.containsKey("Gold")) {
                            if (quantity > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(itemToGet).values().stream().mapToLong(e -> e).sum() + quantity > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(itemToGet)) {
                        if (bag.containsKey("Gem")) {
                            if (quantity > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(itemToGet).values().stream().mapToLong(e -> e).sum() + quantity > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(itemToGet)) {
                bag.put((itemToGet), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(itemToGet).containsKey(item)) {
                bag.get(itemToGet).put(item, 0L);
            }


            bag.get(itemToGet).put(item, bag.get(itemToGet).get(item) + quantity);
            if (itemToGet.equals("Gold")) {
                gold += quantity;
            } else if (itemToGet.equals("Gem")) {
                gems += quantity;
            } else if (itemToGet.equals("Cash")) {
                cash += quantity;
            }
        }

        for (var item : bag.entrySet()) {
            Long sumValues = item.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.printf("<%s> $%s%n", item.getKey(), sumValues);

            item.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}