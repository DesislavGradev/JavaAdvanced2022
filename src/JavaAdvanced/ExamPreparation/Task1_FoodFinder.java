package JavaAdvanced.ExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class Task1_FoodFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vowelArr = scanner.nextLine().split("\\s+");
        ArrayDeque<Character> vowelDeque = new ArrayDeque<>();
        for (String s : vowelArr) {
            vowelDeque.offer(s.charAt(0));
        }
        String[] consonantArr = scanner.nextLine().split("\\s+");
        ArrayDeque<Character> consonantStack = new ArrayDeque<>();
        for (String s : consonantArr) {
            consonantStack.push(s.charAt(0));
        }

        String[] words = new String[]{"pear", "flour", "pork", "olive"};
        String[] foundWords = new String[]{"****", "*****", "****", "*****"};

        while (!consonantStack.isEmpty()) {
            char vowel = vowelDeque.poll();
            char consonant = consonantStack.pop();

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                int indexVowel = word.indexOf(vowel);
                int indexConsonant = word.indexOf(consonant);

                if (indexVowel >= 0) {
                    foundWords[i] = foundWords[i].substring(0, indexVowel) + vowel + foundWords[i].substring(indexVowel + 1);
                }
                if (indexConsonant >= 0) {
                    foundWords[i] = foundWords[i].substring(0, indexConsonant) + consonant + foundWords[i].substring(indexConsonant + 1);
                }
            }
            vowelDeque.offer(vowel);
        }
        List<String> completedWords = Arrays.stream(foundWords).filter(w -> !w.contains("*")).collect(Collectors.toList());

        System.out.printf("Words found: %d%n", completedWords.size());
        completedWords.forEach(System.out::println);
    }
}
