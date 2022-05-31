package Lec3_SetsAndMapsAdvanced.Exercises;

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
                playerDeck.put(personName, new LinkedHashSet<>());
            }
            for (String card : cards) {
                currentDeck.add(card);
            }
            input = scanner.nextLine();
        }
    }
}
