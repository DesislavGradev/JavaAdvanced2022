package Lec5_FunctionalPrograming.LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task2_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, String> countFormatter = l -> "Count = " + l.size();
        String countOutput = countFormatter.apply(numbers);
        System.out.println(countOutput);
        Function<List<Integer>, String> sumFormatter = l -> "Sum = " + l.stream().mapToInt(e -> e).sum();
        String sumOutput = sumFormatter.apply(numbers);
        System.out.println(sumOutput);
    }
}
