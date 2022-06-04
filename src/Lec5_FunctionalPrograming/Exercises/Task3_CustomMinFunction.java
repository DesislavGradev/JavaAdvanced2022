package Lec5_FunctionalPrograming.Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task3_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Function<int[], Integer> smallestElement = arr -> {
            int min = Integer.MAX_VALUE;
            for (int number : numbers) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        };
        System.out.println(smallestElement.apply(numbers));
    }
}
