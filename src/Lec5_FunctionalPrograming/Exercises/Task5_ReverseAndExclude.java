package Lec5_FunctionalPrograming.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task5_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        numbers.removeIf(number -> number % n == 0);
        Collections.reverse(numbers);
        numbers.forEach(el -> System.out.print(el + " "));
    }
}
