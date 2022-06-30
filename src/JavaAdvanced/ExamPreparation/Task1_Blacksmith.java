package JavaAdvanced.ExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class Task1_Blacksmith {
    private static int totalSwords = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] steelArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] carbonArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> steelDeque = new ArrayDeque<>();
        for (int i : steelArr) {
            steelDeque.offer(i);
        }

        ArrayDeque<Integer> carbonStack = new ArrayDeque<>();
        for (int i : carbonArr) {
            carbonStack.push(i);
        }

        Map<String, Integer> swords = new TreeMap<>();
        while (!steelDeque.isEmpty() && !carbonStack.isEmpty()) {
            int carbon = carbonStack.pop();
            int sum = steelDeque.poll() + carbon;

            String swordName = null;
            switch (sum) {
                case 70:
                    swordName = "Gladius";
                    break;
                case 80:
                    swordName = "Shamshir";
                    break;
                case 90:
                    swordName = "Katana";
                    break;
                case 110:
                    swordName = "Sabre";
                    break;
            }
            if (swordName != null) {
                checkSword(swords, swordName);
            } else {
                carbon += 5;
                carbonStack.push(carbon);
            }
        }
        if (swords.isEmpty()) {
            System.out.println("You did not have enough resources to forge a sword.");
        } else {
            System.out.printf("You have forged %d swords.%n", totalSwords);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Steel left: ");
        String remainingSteel;
        if (steelDeque.isEmpty()) {
            remainingSteel = "none";
        } else {
            remainingSteel = steelDeque.stream().map(String::valueOf).collect(Collectors.joining(", "));
        }
        System.out.println(sb.append(remainingSteel));

        sb.setLength(0);
        sb.append("Carbon left: ");
        String remainingCarbon;
        if (carbonStack.isEmpty()) {
            remainingCarbon = "none";
        } else {
            remainingCarbon = carbonStack.stream().map(String::valueOf).collect(Collectors.joining(", "));
        }
        System.out.println(sb.append(remainingCarbon));
        if (!swords.isEmpty()) {
            for (var entry : swords.entrySet()) {
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }
        }
    }

    private static void checkSword(Map<String, Integer> swords, String swordName) {
        Integer swordNum = swords.get(swordName);
        if (swordNum != null) {
            swords.put(swordName, swordNum + 1);
        } else {
            swords.putIfAbsent(swordName, 1);
        }
        totalSwords++;
    }
}
