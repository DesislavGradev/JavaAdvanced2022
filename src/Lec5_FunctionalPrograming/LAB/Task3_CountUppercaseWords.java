package Lec5_FunctionalPrograming.LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3_CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> startsWithUppercase = w -> Character.isUpperCase(w.charAt(0));
        List<String> uppercaseWords = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(startsWithUppercase)
                .collect(Collectors.toList());
        Function<List<String>, Integer> sizePrinter = List::size;
        int size = sizePrinter.apply(uppercaseWords);
        System.out.println(size);

        Consumer<String> printer = System.out::println;
        uppercaseWords.forEach(printer);

    }
}
