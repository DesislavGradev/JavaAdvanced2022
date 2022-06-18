package Lec8_IteratorsAndComparators.Exercises.Task4_Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList= Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Lake lake = new Lake(numbersList);
        List<String> result = new ArrayList<>();
        for (Integer element : lake) {
            result.add(element + "");
        }

        System.out.println(String.join(", ", result));
    }
}
