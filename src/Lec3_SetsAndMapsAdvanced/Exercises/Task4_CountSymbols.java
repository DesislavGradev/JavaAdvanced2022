package Lec3_SetsAndMapsAdvanced.Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task4_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> charOccurrences = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            Integer currentChar = charOccurrences.get(ch);
            if (currentChar == null) {
                currentChar = 1;
            } else {
                currentChar++;
            }
            charOccurrences.put(ch, currentChar);
        }
        for (var entry : charOccurrences.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
