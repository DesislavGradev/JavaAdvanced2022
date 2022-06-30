package JavaAdvanced.Lec3_SetsAndMapsAdvanced.Exercises;

import java.util.*;

public class Task7_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Set<String>> playerDeck = new LinkedHashMap<>();
        while (!input.equals("JOKER")) {
            String[] player = input.split(": ");
            String personName = player[0];
            String[] cards = player[1].split(", ");
            Set<String> currentDeck = playerDeck.get(personName);
            if (currentDeck == null) {
                currentDeck = new LinkedHashSet<>();
                playerDeck.put(personName, currentDeck);
            }
            for (String card : cards) {
                currentDeck.add(card);
            }
            input = scanner.nextLine();
        }
        Map<String, Integer> cardStrength = new HashMap<>();
        cardStrength.put("1", 1);
        cardStrength.put("2", 2);
        cardStrength.put("3", 3);
        cardStrength.put("4", 4);
        cardStrength.put("5", 5);
        cardStrength.put("6", 6);
        cardStrength.put("7", 7);
        cardStrength.put("8", 8);
        cardStrength.put("9", 9);
        cardStrength.put("10", 10);
        cardStrength.put("J", 11);
        cardStrength.put("Q", 12);
        cardStrength.put("K", 13);
        cardStrength.put("A", 14);
        cardStrength.put("S", 4);
        cardStrength.put("H", 3);
        cardStrength.put("D", 2);
        cardStrength.put("C", 1);

        for (var entry : playerDeck.entrySet()) {
            int totalValue = 0;
            for (String s : entry.getValue()) {
                String power;
                String type;
                if (s.length() == 3) {
                    power = s.substring(0,2);
                    type = s.substring(2);
                } else {
                    power = String.valueOf(s.charAt(0));
                    type = String.valueOf(s.charAt(1));
                }
                int cardPower = cardStrength.get(power);
                int cardType = cardStrength.get(type);
                totalValue += cardPower * cardType;

            }
            System.out.println(entry.getKey() + ": " + totalValue);
        }
    }
}
